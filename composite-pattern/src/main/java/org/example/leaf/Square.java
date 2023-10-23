package org.example.leaf;

import org.example.model.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
