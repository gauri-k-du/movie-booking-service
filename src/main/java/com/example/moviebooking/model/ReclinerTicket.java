package com.example.moviebooking.model;
public class ReclinerTicket extends Ticket {
    public ReclinerTicket(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public String getTicketType() {
        return "Premium";
    }
}