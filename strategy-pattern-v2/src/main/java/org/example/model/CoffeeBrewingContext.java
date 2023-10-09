package org.example.model;

public class CoffeeBrewingContext {
    private CoffeeBrewingStrategy coffeeBrewingStrategy;

    public void setCoffeeBrewingStrategy(CoffeeBrewingStrategy coffeeBrewingStrategy) {
        this.coffeeBrewingStrategy = coffeeBrewingStrategy;
    }

    public Coffee execute() {
        return coffeeBrewingStrategy.brewCoffee();
    }
}
