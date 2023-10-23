package org.example;

import org.example.composite.CompositeShape;
import org.example.leaf.Circle;
import org.example.leaf.Square;

public class Main {
    public static void main(String[] args) {
        var circle1 = new Circle();
        var circle2 = new Circle();
        var square = new Square();

        circle1.draw();
        circle2.draw();
        square.draw();

        var composite = new CompositeShape();
        composite.addShapes(circle1,circle2,square);

        composite.draw();

        var composite2 = new CompositeShape();
        composite2.addShapes(composite,circle1,circle2);

        composite2.draw();
    }
}