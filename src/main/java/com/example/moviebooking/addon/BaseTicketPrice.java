package com.example.moviebooking.addon;

public class BaseTicketPrice implements PriceComponent {
    private final double price;

    public BaseTicketPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Base Ticket";
    }
}
