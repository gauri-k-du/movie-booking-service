package com.example.moviebooking.state;

import com.example.moviebooking.model.Booking;

public interface BookingState {
    void next(Booking booking);
    String cancel(Booking booking);
    String status();
}
