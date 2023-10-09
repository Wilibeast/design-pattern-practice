package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var userMenu = """
                __________________________\s
                1. Table Fan\s
                2. Ceiling Fan\s
                3. Exhaust Fan\s
                __________________________
                """;

        System.out.println(userMenu);

        var scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();

        if (userInput > 3 || userInput < 1)
            throw new IllegalArgumentException("Not a valid option");

        FanFactory fanFactory = new FanFactoryImpl();
        Fan fan;
        switch (userInput) {
            case 1 -> fan = fanFactory.createFan(FanType.TABLE);
            case 2 -> fan = fanFactory.createFan(FanType.CEILING);
            case 3 -> fan = fanFactory.createFan(FanType.EXHAUST);
            default -> throw new RuntimeException("Not Implemented");
        }

        fan.blowAir();
    }
}