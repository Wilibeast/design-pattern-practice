package org.example.button;

import org.example.button.Button;

public class MobileButton implements Button {
    @Override
    public void onClick() {
        System.out.println("This is a mobile button");
    }
}
