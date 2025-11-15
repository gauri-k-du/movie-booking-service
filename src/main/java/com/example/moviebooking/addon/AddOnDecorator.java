package com.example.moviebooking.addon;

//Extensible	Add new add-ons without touching Ticket/Booking classes
//Compositional	Add unlimited combinations (Popcorn + Coke + Nachos)
//OCP	New snacks = new decorator classes
//SRP	Snacks pricing is separated from booking logic

public abstract class AddOnDecorator implements PriceComponent {
    protected PriceComponent component;

    public AddOnDecorator(PriceComponent component) {
        this.component = component;
    }
}