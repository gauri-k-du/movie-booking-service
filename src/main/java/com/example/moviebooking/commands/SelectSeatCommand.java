package com.example.moviebooking.commands;

import com.example.moviebooking.model.Booking;

public class SelectSeatCommand implements Command {

    private final Booking booking;

    public SelectSeatCommand(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void execute() {
        System.out.println("Selecting seats: " + booking.getId());

    }

    @Override
    public void undo() {
        System.out.println("Undo seat selection");

    }
}