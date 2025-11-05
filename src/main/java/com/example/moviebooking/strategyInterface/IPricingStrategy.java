package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.*;
import java.util.List;
public interface IPricingStrategy {
    double calculatePrice(Show show, List<Seat> seats);
}