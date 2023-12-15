package com.example.shoppingcart;

public class WarenkorbBezahlenController {
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
        displayOrderDetails();
    }

}
