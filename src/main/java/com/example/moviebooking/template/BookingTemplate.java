package com.example.moviebooking.template;

import com.example.moviebooking.model.Booking;

public abstract class BookingTemplate {

    public final void processBooking(Booking booking) {

        validateShowTime(booking);
        selectSeats(booking);
        calculatePrice(booking);
        applyDiscounts(booking);
        processPayment(booking);
        sendNotifications(booking);

        System.out.println("Booking completed.");
    }

    protected abstract void calculatePrice(Booking booking);

    protected void validateShowTime(Booking b) { /* default impl */ }
    protected void selectSeats(Booking b) { /* default impl */ }
    protected void applyDiscounts(Booking b) { /* default impl */ }
    protected void sendNotifications(Booking b) { /* default impl */ }

    protected abstract void processPayment(Booking booking);
}

