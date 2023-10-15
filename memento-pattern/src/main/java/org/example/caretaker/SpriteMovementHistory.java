package org.example.caretaker;

import org.example.memento.SpriteMovementMemento;

import java.util.ArrayList;
import java.util.List;

public class SpriteMovementHistory {
    private ArrayList<SpriteMovementMemento> mementoList = new ArrayList<>();

    public void add(SpriteMovementMemento spriteMovementMemento) {
        mementoList.add(spriteMovementMemento);
    }

    public SpriteMovementMemento get(int index) {
        return mementoList.get(index);
    }

    public List<SpriteMovementMemento> getHistory() {
        return mementoList;
    }
}
