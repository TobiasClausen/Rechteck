package com.example.projects;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;

public class HelloController {



    @FXML
    private void onButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");         alert.setHeaderText("Hello World!");
        alert.setContentText("Welcome to my first JavaFX application.");
        alert.showAndWait();     }


}