package com.example.moviebooking.model;

public class ImaxTicket extends Ticket {
    public ImaxTicket(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public String getTicketType() {
        return "Normal";
    }
}