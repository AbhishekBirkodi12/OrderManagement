package com.ordermanagement;

import java.util.List;

public class Order {
    private float totalAmount;
    private String orderDate;
    private OrderStatus status;
    private List<Orderline> orderlines;

    public Order( String orderDate, OrderStatus status, List<Orderline> orderlines) {

        this.orderDate = orderDate;
        this.status = status;
        this.orderlines = orderlines;
    }

    public Order() {
    }

    public float getTotalAmount() {
        return totalAmount;
    }

 /*   public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }*/

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Orderline> getOrderLines() {
        return orderlines;
    }

    public void setOrderLines(List<Orderline> orderlines) {
        this.orderlines = orderlines;
    }
}
