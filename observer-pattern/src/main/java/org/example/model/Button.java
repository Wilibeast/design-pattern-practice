package org.example.model;

public class Button implements UiEventListener {
    private int sizePixels = 10;
    private Colour colour = Colour.YELLOW;

    @Override
    public void update(EventType eventType) {
        switch (eventType) {
            case RESIZE:
                sizePixels = sizePixels == 10 ? 20 : 10;
                break;

            case CHANGE_COLOUR:
                colour = colour == Colour.YELLOW ? Colour.RED : Colour.YELLOW;
                break;
        }
    }

    @Override
    public String toString() {
        return "Button{" +
                "sizePixels=" + sizePixels +
                ", colour=" + colour +
                '}';
    }
}
