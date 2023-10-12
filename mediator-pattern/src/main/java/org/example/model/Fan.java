package org.example.model;

import org.example.Mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return this.isOn;
    }
}
