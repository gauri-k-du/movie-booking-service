package com.example.moviebooking.addon;

public class CokeAddOn extends AddOnDecorator {

    public CokeAddOn(PriceComponent component) {
        super(component);
    }

    @Override
    public double getPrice() {
        return component.getPrice() + 80;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ", Coke";
    }
}