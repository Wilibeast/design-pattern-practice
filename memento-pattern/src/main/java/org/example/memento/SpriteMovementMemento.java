package org.example.memento;

import org.example.model.MovementDirection;

public class SpriteMovementMemento {
    MovementDirection movementDirection;

    public SpriteMovementMemento(MovementDirection movementDirection) {
        this.movementDirection = movementDirection;
    }

    public MovementDirection getMovementDirection() {
        return movementDirection;
    }
}
