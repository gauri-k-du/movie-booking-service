package com.example.moviebooking.state;

import com.example.moviebooking.state.Seat;

public class AvailableState implements SeatState {
    @Override
    public void select(Seat seat) {
        System.out.println("Seat selected.");
//        seat.setState(new HeldState());
    }

    @Override public void reserve(Seat seat) { throw new RuntimeException("Select before reserving."); }
    @Override public void cancel(Seat seat) { /* nothing */ }



    @Override public String getName() { return "AVAILABLE"; }
}