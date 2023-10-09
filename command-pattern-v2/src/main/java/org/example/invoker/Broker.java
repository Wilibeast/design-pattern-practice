package org.example.invoker;

import org.example.command.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for(var order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
