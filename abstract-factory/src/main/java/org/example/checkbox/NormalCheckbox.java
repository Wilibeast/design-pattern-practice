package org.example.checkbox;

public class NormalCheckbox implements Checkbox{
    @Override
    public void display() {
        System.out.println("I'm a checkbox that works on all devices except windows");
    }
}
