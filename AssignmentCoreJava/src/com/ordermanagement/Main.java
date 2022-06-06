package com.ordermanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address home = new Address("581351", "kolkata", "India");
        Address work = new Address("560094", "Bangalore", "India");

        Orderline first = new Orderline("cat food", 265f, 2,
                "28-06-2022", OrderlineStatus.intransit, home);
        Orderline second = new Orderline("Lenovo laptop charger",
                2000f, 1, "11-06-2022",
                OrderlineStatus.open, work);

        List<Orderline> cart = new ArrayList<Orderline>();
        cart.add(first);
        cart.add(second);

        Order order= new Order("06-06-2022",OrderStatus.open,cart);
        
    }
}
