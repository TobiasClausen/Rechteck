package com.example.reisezummond;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReiseZumMondApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReiseZumMondApplication.class.getResource("ReiseZumMond.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Reisedauer zum Mond");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}