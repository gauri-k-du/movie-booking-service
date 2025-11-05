package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.User;
public interface IPaymentGateway {
    boolean processPayment(User user, double amount);
}