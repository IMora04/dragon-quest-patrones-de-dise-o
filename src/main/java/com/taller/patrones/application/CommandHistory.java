package com.taller.patrones.application;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history = new ArrayList<>();

    public void push(Command newCommand) {
        history.add(newCommand);
    }

    public Command pop() {
        return history.remove(history.size() - 1);
    }
}