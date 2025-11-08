package com.example.moviebooking.model;

public class NormalTicket extends Ticket {
    public NormalTicket(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public String getTicketType() {
        return "Normal";
    }
}


