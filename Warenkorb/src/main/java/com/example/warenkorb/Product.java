package com.example.warenkorb;

public class Product {
    public int id;
    public String Name;
    public double Price;

    public String unit;

    public int stock;


    public void Name(String product_name) {
        Name=product_name;
    }

    public void Price(double product_price) {
    }

    public void id(int product_id) {
    }

    public void unit(String unit) {
    }

    public void stock(int stock) {
    }
    public String getName(){
        return Name;
    }
}
