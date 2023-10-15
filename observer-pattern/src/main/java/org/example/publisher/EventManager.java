package org.example.publisher;

import org.example.model.EventType;
import org.example.model.UiEventListener;

import java.util.*;

public class EventManager {
    private final Map<EventType, List<UiEventListener>> eventListeners = new HashMap<>();

    public EventManager(EventType... eventTypes) {
        for (var eventType : eventTypes) {
            eventListeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(EventType eventType, UiEventListener listener) {
        var listeners = eventListeners.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(EventType eventType, UiEventListener listener) {
        var listeners = eventListeners.get(eventType);
        listeners.remove(listener);
    }

    public void notifyListeners(EventType eventType) {
        var listeners = eventListeners.get(eventType);

        for(var listener : listeners) {
            listener.update(eventType);
        }
    }
}
