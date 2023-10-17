package org.example.decorator;

import org.example.model.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , with Sugar";
    }
}
