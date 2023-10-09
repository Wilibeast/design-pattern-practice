package org.example;

public abstract class Dialog {
    public void doButtonAction() {
        Button button = createButton();
        button.onClick();
    }

    abstract Button createButton();
}
