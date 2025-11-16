package com.example.moviebooking.state;

import com.example.moviebooking.state.Seat;

public class HeldState implements SeatState {
    @Override
    public void reserve(Seat seat) {
        System.out.println("Seat reserved.");

    }
    @Override public void select(Seat seat) { /* already selected */ }
    @Override public void cancel(Seat seat) {  }


    @Override public String getName() { return "HELD"; }
}