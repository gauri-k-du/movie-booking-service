package com.example.moviebooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Ticket {
    private String seatNumber;
    private double price;

    public abstract String getTicketType();
}
