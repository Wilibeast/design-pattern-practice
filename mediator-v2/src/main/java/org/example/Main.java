package org.example;

import org.example.component.ComponentA;
import org.example.component.ComponentB;
import org.example.mediator.ComponentMediator;

public class Main {
    public static void main(String[] args) {
        var componentA = new ComponentA();
        var componentB = new ComponentB();

        var mediator = new ComponentMediator(componentA, componentB);

        System.out.println("Doing action A");
        componentA.doActionA();
    }
}