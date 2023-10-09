package org.example;

import org.example.model.Subscription;

public class Main {
    public static void main(String[] args) {
        var subscription = new Subscription();

        var ui = new UI(subscription);
        ui.init();
    }
}