package com.example.moviebooking.notificationService;

import com.example.moviebooking.model.Booking;

public class SMSNotifier implements BookingObserver {
    @Override
    public void update(Booking booking) {
        System.out.println("📧 SMS sent for booking: " + booking.getId());
    }
}