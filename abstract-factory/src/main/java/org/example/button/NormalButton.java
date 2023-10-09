package org.example.button;

public class NormalButton implements Button{
    @Override
    public void display() {
        System.out.println("I'm a button that works on Linux and windows");
    }
}
