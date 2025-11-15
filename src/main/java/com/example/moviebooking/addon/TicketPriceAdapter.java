package com.example.moviebooking.addon;

import com.example.moviebooking.model.Ticket;

public class TicketPriceAdapter implements PriceComponent {
    private final Ticket ticket;

    public TicketPriceAdapter(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice();
    }

    @Override
    public String getDescription() {
        return "Base Ticket";
    }
}