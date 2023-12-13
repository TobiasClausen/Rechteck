package com.example.tannenbaum;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class TannenbaumController {
    Tannenbaum t = new Tannenbaum();

    @FXML
    private int IDStammbreite;

    @FXML
    private TextField IDStammhoehe;

    @FXML
    private TextField IDKronenhoehe;

    @FXML
    private TextArea ausgabefield;

    String result;

    public void actionTanneZeichnen(){
        int stammbreite= Integer.parseInt(String.valueOf(IDStammbreite));
        t.setStammbreite(stammbreite);

        int stammhoehe= Integer.parseInt(String.valueOf(IDStammhoehe));
        t.setStammhoehe(stammhoehe);

        int kronenhoehe = Integer.parseInt(String.valueOf(IDKronenhoehe));
        t.setKronenhoehe(kronenhoehe);

        result = t.zeichnen();
        ausgabefield.setText(result);


    }
}