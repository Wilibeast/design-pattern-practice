package org.example.mediator;

import org.example.component.Component;
import org.example.component.ComponentA;
import org.example.component.ComponentB;
import org.example.model.EventType;

public class ComponentMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;

    public ComponentMediator(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentA.setMediator(this);
        this.componentB = componentB;
        this.componentB.setMediator(this);
    }

    public void notifyMediator(Component sender, EventType eventType) {
        switch (eventType) {
            case A:
                System.out.println("Event A triggered");
                this.componentB.doActionC();
                break;
            case B:
                System.out.println("Event B triggered");
                this.componentB.doActionD();
                break;
            case C:
                System.out.println("Event C triggered");
                this.componentA.doActionB();
                break;
            case D:
                System.out.println("Done");
                break;
        }
    }
}
