package com.example.warenkorb;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class WarenkorbController {

    Product p = new Product();
    OrderItem o = new OrderItem();

    @FXML
    private ComboBox ComboBoxProducts;

    @FXML
    private Spinner SpinnerAnzahl;
}