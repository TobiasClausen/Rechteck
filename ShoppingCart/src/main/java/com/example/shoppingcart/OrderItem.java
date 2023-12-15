package com.example.shoppingcart;

public class OrderItem {
    Product p = new Product();

    private int Quantaty;

    public int getQuantaty() {
        return Quantaty;
    }

    public void setQuantaty(int quantaty) {
        Quantaty = quantaty;
    }

    public Double GetAmount(){
        return p.getPrice()*getQuantaty();
    }
}
