package org.example;

import org.example.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var userMenu = """
                __________________________\s
                1. Build Van\s
                2. Build Motorbike\s
                3. Build Sports Car\s
                __________________________
                """;

        System.out.println(userMenu);

        var scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();

        if (userInput > 3 || userInput < 1)
            throw new IllegalArgumentException("Not a valid option");

        var carBuilder = new CarBuilder();

        var car = switch (userInput){
            case 1 -> carBuilder
                    .numberOfDoors(5)
                    .numberOfSeats(7)
                    .numberOfWheels(4)
                    .engineType(EngineType.SIX_CYLINDER)
                    .transmissionType(TransmissionType.MANUAL)
                    .seatType(SeatType.MATERIAL)
                    .build();

            case 2 -> carBuilder
                    .numberOfDoors(0)
                    .numberOfSeats(1)
                    .numberOfWheels(2)
                    .engineType(EngineType.FOUR_CYLINDER)
                    .transmissionType(TransmissionType.MANUAL)
                    .seatType(SeatType.LEATHER)
                    .build();

            case 3 -> carBuilder
                    .numberOfDoors(2)
                    .numberOfSeats(2)
                    .numberOfWheels(4)
                    .engineType(EngineType.EIGHT_CYLINDER)
                    .transmissionType(TransmissionType.AUTOMATIC)
                    .seatType(SeatType.LEATHER)
                    .build();

            default -> throw new RuntimeException("Not Implemented");
        };

        System.out.println(car.toString());
    }
}