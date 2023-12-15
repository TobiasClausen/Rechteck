package com.example.shoppingcart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class ShoppingCartController {

    Product p = new Product();
    OrderItem o = new OrderItem();
    @FXML
    private ComboBox<String> productComboBox;

    @FXML
    private ListView<String> cartListView;

    @FXML
    private Spinner<Integer> quantitySpinner;

    @FXML
    private Label output;

    private Connection connection;



    @FXML
    private void initialize() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://mssql1.webland.ch;encrypt=true;databaseName=d041e_blj;user=d041e_blj;password=BljDbPw_01");

            fillProductComboBox();

            // Konfiguration des Spinners
            configureSpinner();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void navigateToBezahlenView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoppingCartCart-view.fxml"));
            Parent root = loader.load();

            WarenkorbBezahlenController bezahlenController = loader.getController();
            bezahlenController.setOrderItems(orderItems);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    private void configureSpinner() {

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        quantitySpinner.setValueFactory(valueFactory);
    }

    private void fillProductComboBox() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM products");

        while (rs.next()) {
            p.setID(rs.getInt("id"));
            p.setName(rs.getString("product_name"));
            p.setPrice(rs.getDouble("price"));
            productComboBox.getItems().add(p.getName() + " " + p.getPrice() + " CHF");
        }
    }

    @FXML
    private void addToCart() {
        String selectedItem = productComboBox.getSelectionModel().getSelectedItem();
        int quantity = quantitySpinner.getValue();
        o.setQuantaty(quantity);
        output.setText(selectedItem + " x " + quantity);

    }
    @FXML
    private void showCart(ActionEvent event) {
        String selectedItem = productComboBox.getSelectionModel().getSelectedItem();
        if (selectedItem != null && o.getQuantaty() > 0) {
            cartListView.getItems().add(selectedItem + " x " + o.getQuantaty());

        }
    }



    @FXML
    private void checkout() {

        cartListView.getItems().clear();
    }
}
