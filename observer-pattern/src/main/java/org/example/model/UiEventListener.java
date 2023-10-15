package org.example.model;

import java.util.EventListener;

public interface UiEventListener extends EventListener {
    void update(EventType eventType);
}
