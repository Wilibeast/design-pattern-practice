package org.example.dialog;

import org.example.button.Button;

public abstract class Dialog {
    public void doButtonAction() {
        Button button = createButton();
        button.onClick();
    }

    abstract Button createButton();
}
