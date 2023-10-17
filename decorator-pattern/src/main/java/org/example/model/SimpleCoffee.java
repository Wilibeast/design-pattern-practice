package org.example.model;

public class SimpleCoffee implements Coffee{
    @Override
    public double getCost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
