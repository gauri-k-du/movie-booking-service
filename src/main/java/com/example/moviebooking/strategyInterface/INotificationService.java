package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.User;

public interface INotificationService {
    void sendNotification(User user, String message);
}