package org.example.command;

public class SubtractCommand implements MathCommand {
    @Override
    public void execute(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }
}
