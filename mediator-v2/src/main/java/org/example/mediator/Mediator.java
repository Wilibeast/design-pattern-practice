package org.example.mediator;

import org.example.component.Component;
import org.example.model.EventType;

public interface Mediator {
    void notifyMediator(Component sender, EventType eventType);
}
