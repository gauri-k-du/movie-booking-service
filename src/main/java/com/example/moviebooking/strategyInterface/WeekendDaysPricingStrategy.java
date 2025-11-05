package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.*;
import java.util.List;
public class WeekendDaysPricingStrategy implements IPricingStrategy {
    public double calculatePrice(Show show, List<Seat> seats) {
        double weekendFactor = (show.getStartTime().getDayOfWeek().getValue() >= 6) ? 1.2 : 1.0;
        double base = 200.0;
        return seats.stream().mapToDouble(s ->
                (s.getType() == "VIP" ? base * 1.5 : base) * weekendFactor
        ).sum();
    }
}