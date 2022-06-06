package com.ordermanagement;

public class Orderline {
    private String item;
    private float price;
    private int quantity;
    private String eta;
    private OrderlineStatus status;
    private Address address;


    public Orderline(String item, float price, int quantity, String eta, OrderlineStatus status, Address address) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.eta = eta;
        this.status = status;
        this.address = address;
    }

    public Orderline() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public OrderlineStatus getStatus() {
        return status;
    }

    public void setStatus(OrderlineStatus status) {
        this.status = status;
    }
}
