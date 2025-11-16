package com.example.moviebooking.template;

import com.example.moviebooking.model.Booking;

public class StandardBooking extends BookingTemplate {

    @Override
    protected void calculatePrice(Booking booking) {
//        booking.setAmount(booking.getSeats().size() * 200);
    }

    @Override
    protected void processPayment(Booking booking) {
        System.out.println("Charging via standard payment gateway.");
    }

}

