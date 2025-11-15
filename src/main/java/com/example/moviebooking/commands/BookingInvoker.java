package com.example.moviebooking.commands;

import java.util.Stack;

public class BookingInvoker {

    private final Stack<Command> commandHistory = new Stack<>();

    public void run(Command command) throws Exception {
        try {
            command.execute();
            commandHistory.push(command);
        } catch (Exception ex) {
            System.out.println("Error occurred! Rolling back…");
            rollback();
            throw ex;
        }
    }

    private void rollback() {
        while (!commandHistory.isEmpty()) {
            Command cmd = commandHistory.pop();
            cmd.undo();
        }
    }
}

