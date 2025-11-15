package com.example.moviebooking.controller;

import com.example.moviebooking.model.*;
import com.example.moviebooking.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingServiceController {



//    @GetMapping
//    public List<Movie> getBookMovie() {
//        return bookingService.bookMovie();
//    }
    private final BookingService bookingService;

    @Autowired
    public BookingServiceController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping
    public Booking bookSeats(@RequestBody BookingRequest request) throws Exception {
        User user = new User(request.getUserId(), request.getUserName(),request.getEmail());
        Show show = new Show(request.getId(), request.getMovieName(), request.getScreenType());
        List<Seat> seats = request.getSeatNumbers().stream()
                .map(seatNum -> new Seat(12345, seatNum, "REGULAR"))
                .toList();
        String addonName = request.getAddonName();
        return bookingService.bookSeats(user, show, seats, request.getTicketType(),addonName);
    }
}

