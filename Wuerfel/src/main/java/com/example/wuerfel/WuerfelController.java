package com.example.wuerfel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WuerfelController {
    Wuerfel wuerfel = new Wuerfel();

    @FXML
    private Label ausgabeTextField;

    @FXML
    private Label LetzterWurf;

    @FXML
    protected void WuerfelButtonClick() {

        String ausgabe = String.valueOf(wuerfel.werfen());
        String LetzterWurfausgbe = String.valueOf(wuerfel.getLetzerWurf());

        ausgabeTextField.setText(ausgabe);
        LetzterWurf.setText(LetzterWurfausgbe);
    }

}