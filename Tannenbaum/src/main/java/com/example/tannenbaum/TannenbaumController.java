package com.example.tannenbaum;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class TannenbaumController {
    Tannenbaum t = new Tannenbaum();

    @FXML
    private TextField IDStammbreite;

    @FXML
    private TextField IDStammhoehe;

    @FXML
    private TextField IDKronenhoehe;

    @FXML
    private TextArea ausgabefield;

    String result;

    public void actionTanneZeichnen(){
        try {
            ausgabefield.clear();
            int stammbreite = Integer.parseInt(IDStammbreite.getText());
            t.setStammbreite(stammbreite);

            int stammhoehe= Integer.parseInt(IDStammhoehe.getText());
            t.setStammhoehe(stammhoehe);

            int kronenhoehe = Integer.parseInt(IDKronenhoehe.getText());
            t.setKronenhoehe(kronenhoehe);

            result = t.zeichnen();
            ausgabefield.setText(result);
        }catch (Exception e){
            ausgabefield.setText("zahlen eingeben");
        }
    }
}