package org.example.model;

public class Dialog implements UiEventListener {
    private int sizePixels = 100;
    private Colour colour = Colour.YELLOW;

    @Override
    public void update(EventType eventType) {
        switch (eventType) {
            case RESIZE:
                sizePixels = sizePixels == 100 ? 200 : 100;
                break;

            case CHANGE_COLOUR:
                colour = colour == Colour.YELLOW ? Colour.RED : Colour.YELLOW;
                break;
        }
    }

    @Override
    public String toString() {
        return "Dialog{" +
                "sizePixels=" + sizePixels +
                ", colour=" + colour +
                '}';
    }
}
