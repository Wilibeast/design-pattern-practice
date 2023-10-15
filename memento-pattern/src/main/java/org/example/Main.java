package org.example;

import org.example.caretaker.SpriteMovementHistory;
import org.example.model.MovementDirection;
import org.example.originator.SpriteMovement;

public class Main {
    public static void main(String[] args) {
        var spriteMovement = new SpriteMovement();
        var movementHistory = new SpriteMovementHistory();

        spriteMovement.setMovementDirection(MovementDirection.UP);
        movementHistory.add(spriteMovement.saveDirectionToMemento());

        spriteMovement.setMovementDirection(MovementDirection.LEFT);
        movementHistory.add(spriteMovement.saveDirectionToMemento());

        spriteMovement.setMovementDirection(MovementDirection.RIGHT);
        movementHistory.add(spriteMovement.saveDirectionToMemento());

        spriteMovement.setMovementDirection(MovementDirection.DOWN);
        movementHistory.add(spriteMovement.saveDirectionToMemento());

        for(var movement : movementHistory.getHistory()) {
            System.out.println("Movement Direction : " + movement.getMovementDirection());
        }
    }
}