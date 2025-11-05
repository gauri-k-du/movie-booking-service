package com.example.moviebooking.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.moviebooking.model.Show;
import com.example.moviebooking.model.Seat;
import com.example.moviebooking.model.User;
import com.example.moviebooking.model.BookingStatus;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private Long id;
    private User user;
    private Show show;
    private List<Seat> seats;
    private double totalPrice;
    private BookingStatus status;
}