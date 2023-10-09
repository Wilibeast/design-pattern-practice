package org.example.model;

public class CoffeeInstantStrategy implements CoffeeBrewingStrategy {
    @Override
    public Coffee brewCoffee() {
        var coffee = new Coffee();
        cleanMachines();
        placeCoffee();
        pourWater();

        coffee.setDoneBrewing(true);
        return coffee;
    }

    private void cleanMachines() {
        System.out.println("Cleaning machines");
    }

    private void placeCoffee() {
        System.out.println("Placing coffee in mug");
    }

    private void pourWater() {
        System.out.println("Pouring water over coffee");
    }
}
