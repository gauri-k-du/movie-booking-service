package com.example.moviebooking.state;

public class Seat {
    private SeatState state = new AvailableState();
    private int seatNumber;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setState(SeatState state) { this.state = state; }
    public SeatState getState() { return state; }

    public void select() { state.select(this); }
    public void reserve() { state.reserve(this); }
    public void cancel() { state.cancel(this); }
}
