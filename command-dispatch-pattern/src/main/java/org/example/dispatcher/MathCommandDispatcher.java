package org.example.dispatcher;

import org.example.command.MathCommand;
import org.example.model.MathCommandType;

import java.util.HashMap;
import java.util.Map;

public class MathCommandDispatcher {
    private Map<MathCommandType, MathCommand> commands = new HashMap<>();

    public void register(MathCommandType operation, MathCommand command) {
        commands.put(operation, command);
    }

    public void execute(MathCommandType operation, int a, int b) {
        var command = commands.get(operation);
        if (command == null)
            System.out.println("Operation not supported");
        else {
            command.execute(a, b);
        }
    }
}
