package com.example.moviebooking.service;
import com.example.moviebooking.factory.TicketFactory;
import com.example.moviebooking.model.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import com.example.moviebooking.strategyInterface.IPricingStrategy;
import com.example.moviebooking.strategyInterface.IPaymentGateway;

import static com.example.moviebooking.model.Booking.*;

public class BookingService {
//    private final IPricingStrategy pricingStrategy;
//    private final IPaymentGateway paymentGateway;

//    public BookingService(IPricingStrategy pricingStrategy, IPaymentGateway paymentGateway) {
//        this.pricingStrategy = pricingStrategy;
//        this.paymentGateway = paymentGateway;
//    }

    public Booking bookSeats(User user, Show show, List<Seat> seatNumbers, String ticketType) {
        List<Ticket> tickets = seatNumbers.stream()
                .map(seat -> TicketFactory.createTicket(ticketType, "2", 250.0))
                .collect(Collectors.toList());

        double total = tickets.stream().mapToDouble(Ticket::getPrice).sum();
        String random = UUID.randomUUID().toString().replace("-", "");
        System.out.println("random"+random);
        return Booking.builder()
                .id(random)
                .user(user)
                .show(show)
                .totalPrice(total)
                .build();
    }
}