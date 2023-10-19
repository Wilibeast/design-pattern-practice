package org.example;

import org.example.command.AddCommand;
import org.example.command.DivideCommand;
import org.example.command.MultiplyCommand;
import org.example.command.SubtractCommand;
import org.example.dispatcher.MathCommandDispatcher;
import org.example.model.MathCommandType;

public class Main {
    public static void main(String[] args) {
        var commandDispatcher = new MathCommandDispatcher();

        commandDispatcher.register(MathCommandType.ADD, new AddCommand());
        commandDispatcher.register(MathCommandType.SUBTRACT, new SubtractCommand());
        commandDispatcher.register(MathCommandType.DIVIDE, new DivideCommand());
        commandDispatcher.register(MathCommandType.MULTIPLY, new MultiplyCommand());

        commandDispatcher.execute(MathCommandType.ADD,10,5);
        commandDispatcher.execute(MathCommandType.SUBTRACT,10,5);
        commandDispatcher.execute(MathCommandType.MULTIPLY,10,5);
        commandDispatcher.execute(MathCommandType.DIVIDE,10,0);
    }
}