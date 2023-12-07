package com.example.projects;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechteckController {
    Rechteck rechteck = new Rechteck();
    @FXML
    private TextField widthTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private TextField ausgabeTextField;
    @FXML
    protected void BerechnenButtonClick() {
        double width = Double.parseDouble(widthTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());

        rechteck.setWidth(width);
        rechteck.setHeight(height);
        String ausgabe = String.valueOf(rechteck.getArea());

        ausgabeTextField.setText(ausgabe);
    }


    @FXML
    protected void ExitScene(){
        rechteck.Exit();
    }
}