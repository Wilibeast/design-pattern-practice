package org.example;

import org.example.button.Button;
import org.example.checkbox.Checkbox;
import org.example.dialog.Dialog;

import java.util.Scanner;

public class Main {
    private static GuiFactory guiFactory;
    public static void main(String[] args) {
        var userMenu = """
                Please input Platform:\s
                1. Windows
                2. Linux
                3. Mac
                4. Mobile
                """;
        System.out.println(userMenu);
        var scanner = new Scanner(System.in);

        var userInput = scanner.nextInt();
        initialize(userInput);

        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();
        Dialog dialog = guiFactory.createDialog();

        button.display();
        checkbox.display();
        dialog.display();
    }

    private static void initialize(int userInput) {
        switch (userInput) {
            case 1 -> guiFactory = new WindowsGuiFactory();
            case 2 -> guiFactory = new LinuxGuiFactory();
            case 3 -> guiFactory = new MacGuiFactory();
            case 4 -> guiFactory = new MobileGuiFactory();
            default -> throw new RuntimeException("Not Implemented");
        }
    };
}