package com.example.moviebooking.state;

import com.example.moviebooking.state.Seat;

public interface SeatState {
    void select(Seat seat);
    void reserve(Seat seat);
    void cancel(Seat seat);
    String getName();
}
