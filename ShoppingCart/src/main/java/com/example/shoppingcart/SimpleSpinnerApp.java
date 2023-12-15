package com.example.shoppingcart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleSpinnerApp extends Application {

    @Override
    public void start(Stage stage) {
        // Erstellen des Spinners mit Integer-Werten
        Spinner<Integer> spinner = new Spinner<>();

        // Konfiguration des Spinners: Startwert 0, Mindestwert 0, Höchstwert 100, Schrittweite 1
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0, 1));

        // Listener hinzufügen, um Änderungen zu überwachen (optional)
        spinner.valueProperty().addListener((obs, oldValue, newValue) -> {
            System.out.println("Ausgewählter Wert: " + newValue);
        });

        VBox vbox = new VBox(spinner);
        Scene scene = new Scene(vbox, 200, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

