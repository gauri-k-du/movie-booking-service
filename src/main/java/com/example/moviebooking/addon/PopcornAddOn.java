package com.example.moviebooking.addon;

public class PopcornAddOn extends AddOnDecorator {
    public PopcornAddOn(PriceComponent component) {
        super(component);
    }

    @Override
    public double getPrice() {
        System.out.println("PopcornAddOn price is: " + component.getPrice());
        System.out.println("PopcornAddOn price is added: " + component.getPrice()+150);
        return component.getPrice() + 150;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ", Popcorn";
    }
}