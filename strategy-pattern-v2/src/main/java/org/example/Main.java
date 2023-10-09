package org.example;

import org.example.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var userMenu = """
                __________________________\s
                1. Brew Coffee With Filter\s
                2. Brew Instant Coffee\s
                3. Brew Coffee With Machine\s
                __________________________
                """;

        System.out.println(userMenu);

        var scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();

        if (userInput > 3 || userInput < 1)
            throw new IllegalArgumentException("Not a valid option");

        var context = new CoffeeBrewingContext();

        switch (userInput) {
            case 1 -> context.setCoffeeBrewingStrategy(new CoffeeFilterStrategy());
            case 2 -> context.setCoffeeBrewingStrategy(new CoffeeInstantStrategy());
            case 3 -> context.setCoffeeBrewingStrategy(new CoffeeMachineStrategy());
            default -> throw new RuntimeException();
        };

        var coffee = context.execute();
        coffee.drink();
    }
}