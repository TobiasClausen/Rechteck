package com.example.auto;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class AutoController {
    Auto a =new Auto();
    private boolean gasPressed = false;
    private boolean brakePressed = false;
    @FXML
    private ComboBox Autotyp;
    @FXML
    private Label LabelPS;
    @FXML
    private Label LabelKmH;
    @FXML
    private Label LabelGear;
    @FXML
    private ProgressBar ProgressBarTank;

    @FXML
    private Button Anlassbutton;



    public void initialize() {
        a.schalteMotorAus();
        ProgressBarTank.setProgress(a.getTankFuelstand());
        if (Autotyp.getItems().isEmpty()) {
            Autotyp.getItems().addAll("Opel", "Porsche", "Ferrari");
        }


        Autotyp.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                a.setMarke(String.valueOf(newVal));
                LabelPS.setText(String.valueOf(a.getPs()));
            }
        });
    }


    @FXML
    private void ActionAnlassen(){
        if (a.isIstMotorGestartet()==false) {
            a.starteMotor();
            Anlassbutton.setText("Anschalten");
        }else if (a.isIstMotorGestartet()){
            a.schalteMotorAus();
            Anlassbutton.setText("Auschalten");
        }
        updatedata();
    }
    @FXML
    public void ActionHupen(){
        a.hube();
    }
    @FXML
    private void ActionTanken(){
        a.auftanken();
        ProgressBarTank.setProgress(a.getTankFuelstand());
        updatedata();
    }

    @FXML
    private void ActionGas() {
        gasPressed = true;
        new Thread(() -> {
            while (gasPressed) {
                a.gibGas();
                updatedata();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    @FXML
    private void ActionNoGas() {
        gasPressed = false;
    }


    @FXML
    private void ActionBremsen() {
        brakePressed = true;
        new Thread(() -> {
            while (brakePressed) {
                a.bremsen();
                updatedata();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @FXML
    private void ActionNoBremsen() {
        brakePressed = false;
    }

    private void updatedata() {
        Platform.runLater(() -> {
            ProgressBarTank.setProgress(a.getTankFuelstand());
            LabelKmH.setText(String.valueOf(a.getAktualleGeschwindigkeit()));
            LabelGear.setText(String.valueOf(a.getAktuellerGang()));
        });
    }



}