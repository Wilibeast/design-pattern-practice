package org.example.command;

public class MultiplyCommand implements MathCommand{
    @Override
    public void execute(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }
}
