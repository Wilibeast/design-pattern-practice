package org.example.button;

public class MobileButton implements Button{
    @Override
    public void display() {
        System.out.println("I'm a button that only works on mobile");
    }
}
