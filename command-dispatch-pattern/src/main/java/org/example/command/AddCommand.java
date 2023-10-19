package org.example.command;

public class AddCommand implements MathCommand{
    @Override
    public void execute(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
}
