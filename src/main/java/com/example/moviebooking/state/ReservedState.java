package com.example.moviebooking.state;

import com.example.moviebooking.state.Seat;

public class ReservedState implements SeatState {
    @Override
    public void reserve(Seat seat) { /* already reserved */ }
    @Override
    public void cancel(Seat seat) {  }
    @Override public void select(Seat seat) { /* ignore */ }


    @Override public String getName() { return "RESERVED"; }
}