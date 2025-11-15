package com.example.moviebooking.theatre;

import java.util.ArrayList;
import java.util.List;

public class TheatreScreen implements TheatreComponent {
    private String screenName;
    private List<TheatreComponent> rows = new ArrayList<>();

    public TheatreScreen(String name) {
        this.screenName = name;
    }

    public void addRow(TheatreComponent row) {
        rows.add(row);
    }

    @Override
    public void showLayout() {
        System.out.println("Screen: " + screenName);
        rows.forEach(TheatreComponent::showLayout);
    }

    @Override
    public int getSeatCount() {
        return rows.stream().mapToInt(TheatreComponent::getSeatCount).sum();
    }
}