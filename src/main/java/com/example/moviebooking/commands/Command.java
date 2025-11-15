package com.example.moviebooking.commands;

public interface Command {
    void execute() throws Exception;

    default void undo() {
        // Optional - not every command needs undo
    }
}
