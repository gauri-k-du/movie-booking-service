package com.example.moviebooking.model;
public class PremiumTicket extends Ticket {
    public PremiumTicket(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public String getTicketType() {
        return "Premium";
    }
}