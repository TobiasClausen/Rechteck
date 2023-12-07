package com.example.reisezummond;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ReiseZumMondController {

    @FXML
    private TextField TextfieldGeschwindigkeit;

    @FXML
    private RadioButton RadioButtoninTagen;

    @FXML
    private RadioButton RadioButtoninStunden;

    @FXML
    private TextField  AusgabeField;

    public void ActionReisedauerBerechnen() {
        double Geschwindigkeit = Double.parseDouble(TextfieldGeschwindigkeit.getText());

        Mondreise mondreise = new Mondreise(Geschwindigkeit);

        double result = 0.0;

        if (RadioButtoninTagen.isSelected()) {
            result = mondreise.getTravelDurationDays();
        } else if (RadioButtoninStunden.isSelected()) {
            result = mondreise.getTravelDurationHours();
        }

        String ausgabe = String.valueOf(result);
        AusgabeField.setText(ausgabe);
    }
}
