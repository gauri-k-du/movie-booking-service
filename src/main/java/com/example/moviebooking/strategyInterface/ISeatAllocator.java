package com.example.moviebooking.strategyInterface;
import com.example.moviebooking.model.*;
import java.util.List;
public interface ISeatAllocator {
    List<Seat> allocateSeats(Show show, int count);
}