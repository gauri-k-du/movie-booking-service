package com.example.moviebooking.notificationService;

import ch.qos.logback.core.util.COWArrayList;
import com.example.moviebooking.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookingNotificationService implements BookingSubject {

    private List<BookingObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(BookingObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(BookingObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Booking booking) {
        for (BookingObserver observer : observers) {
            observer.update(booking);
        }
    }
}