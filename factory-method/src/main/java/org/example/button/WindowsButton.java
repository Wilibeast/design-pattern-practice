package org.example.button;

import org.example.button.Button;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("This is a windows button");
    }
}
