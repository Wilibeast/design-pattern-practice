package org.example.composite;

import org.example.model.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape... shapes) {
        this.shapes.addAll(Arrays.asList(shapes));
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a composite shape");

        for (var shape : this.shapes) {
            shape.draw();
        }
    }
}
