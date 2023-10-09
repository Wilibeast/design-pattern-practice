package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        var userMenu = """
                __________________________\s
                1. Windows\s
                2. Linux\s
                3. Mobile\s
                __________________________
                """;

        System.out.println(userMenu);

        var scanner = new Scanner(System.in);
        var userInput = scanner.nextInt();

        if (userInput > 3 || userInput < 1)
            throw new IllegalArgumentException("Not a valid option");

        Dialog dialog;
        switch (userInput) {
            case 1 -> dialog = new WindowsDialog();
            case 2 -> dialog = new LinuxDialog();
            case 3 -> dialog = new MobileDialog();
            default -> throw new RuntimeException("Not Implemented");
        }

        dialog.doButtonAction();
    }
}