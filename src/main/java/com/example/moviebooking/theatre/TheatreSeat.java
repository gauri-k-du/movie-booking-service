package com.example.moviebooking.theatre;

public class TheatreSeat implements TheatreComponent {
    private String seatNumber;
    private boolean available;

    public TheatreSeat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.available = true;
    }

    @Override
    public void showLayout() {
        System.out.println("Seat: " + seatNumber + " (" + (available ? "Available" : "Booked") + ")");
    }

    @Override
    public int getSeatCount() {
        return 1;
    }
}