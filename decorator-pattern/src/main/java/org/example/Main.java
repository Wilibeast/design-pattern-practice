package org.example;

import org.example.decorator.MilkDecorator;
import org.example.decorator.SugarDecorator;
import org.example.model.Coffee;
import org.example.model.SimpleCoffee;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.printf("Simple Coffee\n Cost: %s\n Description: %s\n ====\n", simpleCoffee.getCost(), simpleCoffee.getDescription());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.printf("Coffee with milk\n Cost: %s\n Description: %s\n ====\n", coffeeWithMilk.getCost(), coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.printf("Coffee with milk and sugar\n Cost %s\n Description: %s\n ====\n", coffeeWithMilkAndSugar.getCost(), coffeeWithMilkAndSugar.getDescription());
    }
}