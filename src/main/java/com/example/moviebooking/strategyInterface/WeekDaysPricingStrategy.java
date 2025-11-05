package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.*;
import com.example.moviebooking.strategyInterface.*;
import java.util.List;
public class WeekDaysPricingStrategy implements IPricingStrategy {
    public double calculatePrice(Show show, List<Seat> seats) {
        double base = 200.0;
        return seats.stream().mapToDouble(s ->
                s.getType() == "VIP" ? base * 1.5 : base
        ).sum();
    }
}