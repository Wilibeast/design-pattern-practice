package org.example;

import org.example.model.Button;
import org.example.model.Dialog;
import org.example.model.EventType;
import org.example.model.UiEventListener;
import org.example.publisher.EventManager;

public class Main {
    public static void main(String[] args) {
        var eventManager = new EventManager(EventType.RESIZE,EventType.CHANGE_COLOUR);

        var button = new Button();
        var dialog = new Dialog();

        System.out.println("Initial state");
        printStatus(button,dialog);

        eventManager.subscribe(EventType.RESIZE,button);
        eventManager.subscribe(EventType.CHANGE_COLOUR,dialog);

        eventManager.notifyListeners(EventType.RESIZE);

        System.out.println("Resize event (Button only)");
        printStatus(button,dialog);

        eventManager.notifyListeners(EventType.CHANGE_COLOUR);

        System.out.println("Change colour event (Dialog only)");
        printStatus(button,dialog);

        eventManager.subscribe(EventType.CHANGE_COLOUR,button);
        eventManager.notifyListeners(EventType.CHANGE_COLOUR);

        System.out.println("Change colour event (Button and dialog)");
        printStatus(button,dialog);

        eventManager.unsubscribe(EventType.CHANGE_COLOUR,dialog);
        eventManager.notifyListeners(EventType.CHANGE_COLOUR);

        System.out.println("Change colour event (Button only)");
        printStatus(button,dialog);
    }

    private static void printStatus(UiEventListener... components) {
        for(var component : components) {
            System.out.println(component.toString());
        }
        System.out.println("=====================");
    }
}