package org.example.dialog;

public class DesktopDialog implements Dialog{
    @Override
    public void display() {
        System.out.println("I'm a dialog that works on desktop");
    }
}
