package org.example.model;

public class CoffeeMachineStrategy implements CoffeeBrewingStrategy{
    @Override
    public Coffee brewCoffee() {
        var coffee = new Coffee();
        cleanMachines();
        placeMug();
        pressCoffeeButton();

        coffee.setDoneBrewing(true);
        return coffee;
    }

    private void cleanMachines() {
        System.out.println("Cleaning machines");
    }

    private void placeMug() {
        System.out.println("Placing mug in machine");
    }

    private void pressCoffeeButton() {
        System.out.println("Pressing coffee button");
    }
}
