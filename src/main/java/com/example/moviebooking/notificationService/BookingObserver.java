package com.example.moviebooking.notificationService;

import com.example.moviebooking.model.Booking;

public interface BookingObserver {
    void update(Booking booking);
}
