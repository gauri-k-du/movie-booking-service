package com.example.moviebooking.factory;

import com.example.moviebooking.model.*;

public class TicketFactory {
    public static Ticket createTicket(String type, String seatNumber, double basePrice) {
        System.out.println("vghjkl::::"+type);
        switch (type.toLowerCase()) {
            case "regular":
                return new NormalTicket(seatNumber, basePrice);
            case "premium":
                return new PremiumTicket(seatNumber, basePrice * 1.5);
            case "imax":
                return new PremiumTicket(seatNumber, basePrice * 2.0);
            case "recliner":
                return new PremiumTicket(seatNumber, basePrice * 2.5);
            default:
                throw new IllegalArgumentException("Invalid ticket type: " + type);
        }
    }
}
