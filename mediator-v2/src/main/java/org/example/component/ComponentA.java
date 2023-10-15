package org.example.component;

import org.example.mediator.ComponentMediator;
import org.example.mediator.Mediator;
import org.example.model.EventType;

public class ComponentA implements Component{
    private Mediator mediator;
    @Override
    public void setMediator(ComponentMediator mediator) {
        this.mediator = mediator;
    }

    public void doActionA() {
        System.out.println("Component A does Action A");
        this.mediator.notifyMediator(this, EventType.A);
    }

    public void doActionB(){
        System.out.println("Component A does Action B");
        this.mediator.notifyMediator(this, EventType.B);
    }
}
