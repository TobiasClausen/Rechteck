package com.example.warenkorb;

public class OrderItem {
    Product product = new Product();
    public int Quantity;
    public double GetAmount(){
        return product.Price*Quantity;
    }
}
