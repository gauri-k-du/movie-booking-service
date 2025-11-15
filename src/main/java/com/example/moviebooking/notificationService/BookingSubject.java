package com.example.moviebooking.notificationService;

import com.example.moviebooking.model.Booking;

public interface BookingSubject {
    void addObserver(BookingObserver observer);
    void removeObserver(BookingObserver observer);
    void notifyObservers(Booking booking);
}
