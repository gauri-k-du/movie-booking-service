package com.example.moviebooking.notificationService;

import com.example.moviebooking.model.Booking;

public class EmailNotifier implements BookingObserver {
    @Override
    public void update(Booking booking) {
        System.out.println("📧 Email sent for booking: " + booking.getId());
    }
}