package com.example.auto;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SpinnerValueFactory;



public class AutoController {
    Auto a =new Auto();
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
        }else if (a.isIstMotorGestartet()){
            a.schalteMotorAus();
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
    private void ActionBremsen(){
        a.bremsen();
        updatedata();
    }
    @FXML
    private void ActionGas(){
        a.gibGas();
        updatedata();
    }

    private void updatedata(){
            ProgressBarTank.setProgress(a.getTankFuelstand());
            LabelKmH.setText(String.valueOf(a.getAktualleGeschwindigkeit()));
            LabelGear.setText(String.valueOf(a.getAktuellerGang()));
    }


}