package com.example.moviebooking.template;

import com.example.moviebooking.model.Booking;

public class LoyaltyBooking extends BookingTemplate {

    @Override
    protected void calculatePrice(Booking booking) {
//        booking.setAmount(booking.getSeats().size() * 150); // discounted
    }

    @Override
    protected void processPayment(Booking booking) {
        System.out.println("Charging via loyalty points.");
    }

}

