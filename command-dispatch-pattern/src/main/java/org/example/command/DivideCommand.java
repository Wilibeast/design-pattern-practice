package org.example.command;

public class DivideCommand implements MathCommand {
    @Override
    public void execute(int a, int b) {
        if (b == 0)
            System.out.println("Division by zero is not allowed.");
        else {
            System.out.println("Divide: " + (a / b));
        }
    }
}
