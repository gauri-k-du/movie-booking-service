package com.example.moviebooking.theatre;

import java.util.ArrayList;
import java.util.List;

public class Row implements TheatreComponent {
    private String rowName;
    private List<TheatreComponent> seats = new ArrayList<>();

    public Row(String rowName) {
        this.rowName = rowName;
    }

    public void addSeat(TheatreComponent seat) {
        seats.add(seat);
    }

    @Override
    public void showLayout() {
        System.out.println("Row " + rowName + ":");
        seats.forEach(TheatreComponent::showLayout);
    }

    @Override
    public int getSeatCount() {
        return seats.stream().mapToInt(TheatreComponent::getSeatCount).sum();
    }
}