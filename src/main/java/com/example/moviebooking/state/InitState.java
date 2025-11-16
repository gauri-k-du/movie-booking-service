package com.example.moviebooking.state;

import com.example.moviebooking.model.Booking;

public class InitState implements BookingState {
    @Override
    public void next(Booking booking) {
//        booking.setState(new SeatsSelectedState());
    }

    @Override
    public String cancel(Booking booking) {
//        booking.setState(new CancelledState());
        return "";
    }


    public String status() { return "INIT"; }
}