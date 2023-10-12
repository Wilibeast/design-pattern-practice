package org.example.model;

import org.example.Mediator;

public class Button {
    private Mediator mediator;

    public void press() {
        mediator.press();
    }
}
