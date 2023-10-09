package org.example.model;

public class Stock {
    private final String name ;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        quantity++;
        System.out.println("Bought new stock: " + "\nStock: " + name + "\nQuantity: " + quantity + "\n");
    }

    public void sell() {
        quantity--;
        System.out.println("Sold stock: " + "\nStock: " + name + "\nQuantity: " + quantity + "\n");
    }
}
