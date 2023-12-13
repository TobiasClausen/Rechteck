package com.example.tannenbaum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TannenbaumApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TannenbaumApplication.class.getResource("Tannenbaum.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tannenbaum");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}