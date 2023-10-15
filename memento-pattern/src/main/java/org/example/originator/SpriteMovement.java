package org.example.originator;

import org.example.memento.SpriteMovementMemento;
import org.example.model.MovementDirection;

public class SpriteMovement {
    private MovementDirection movementDirection;

    public MovementDirection getMovementDirection() {
        return movementDirection;
    }

    public void setMovementDirection(MovementDirection movementDirection) {
        this.movementDirection = movementDirection;
    }

    public SpriteMovementMemento saveDirectionToMemento() {
        return new SpriteMovementMemento(movementDirection);
    }

    public void getDirectionFromMemento(SpriteMovementMemento memento) {
        movementDirection = memento.getMovementDirection();
    }
}
