package org.example.model;

public class PowerSupplier {
    private boolean isOn = false;
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
