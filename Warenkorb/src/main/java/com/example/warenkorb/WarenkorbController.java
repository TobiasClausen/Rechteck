package com.example.warenkorb;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class WarenkorbController {

    Product p = new Product();
    OrderItem o = new OrderItem();

    @FXML
    private ComboBox ComboBoxProducts;

    @FXML
    private Spinner SpinnerAnzahl;

    String connectionString = "jdbc:sqlserver://mssql1.webland.ch;encrypt=true;databaseName=d041e_blj;user=d041e_blj;password=BljDbPw_01";
    Connection connection;

    public WarenkorbController() {
        try {
            connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from products");

            while (rs.next()) {
                p.Name(rs.getString("product_name"));
                p.Price(rs.getDouble("product_price"));
                p.id(rs.getInt("product_id"));
                p.unit(rs.getString("unit"));
                p.stock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ZumWarenkorbHinzufügen() {

    }
}



