package com.taller.patrones.application;

public interface Command {
    void execute();
    void undo();
}