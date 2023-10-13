package org.example.button;

import org.example.button.Button;

public class LinuxButton implements Button {
    @Override
    public void onClick() {
        System.out.println("This is a linux button");
    }
}
