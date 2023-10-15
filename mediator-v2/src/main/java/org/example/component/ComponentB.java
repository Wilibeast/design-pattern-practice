package org.example.component;

import org.example.mediator.ComponentMediator;
import org.example.mediator.Mediator;
import org.example.model.EventType;

public class ComponentB implements Component{
    private Mediator mediator;
    @Override
    public void setMediator(ComponentMediator mediator) {
        this.mediator = mediator;
    }

    public void doActionC(){
        System.out.println("Component B does Action C");
        this.mediator.notifyMediator(this, EventType.C);
    }

    public void doActionD(){
        System.out.println("Component B does Action D");
        this.mediator.notifyMediator(this, EventType.D);
    }
}
