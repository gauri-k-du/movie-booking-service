package com.example.moviebooking.service;
import com.example.moviebooking.model.Show;
import com.example.moviebooking.model.Seat;
import com.example.moviebooking.model.User;
import com.example.moviebooking.model.Booking;
import com.example.moviebooking.model.BookingStatus;
import java.util.List;
import com.example.moviebooking.strategyInterface.IPricingStrategy;
import com.example.moviebooking.strategyInterface.IPaymentGateway;
public class BookingService {
    private final IPricingStrategy pricingStrategy;
    private final IPaymentGateway paymentGateway;

    public BookingService(IPricingStrategy pricingStrategy, IPaymentGateway paymentGateway) {
        this.pricingStrategy = pricingStrategy;
        this.paymentGateway = paymentGateway;
    }

    public Booking bookSeats(User user, Show show, List<Seat> seats) {
        double amount = pricingStrategy.calculatePrice(show, seats);
        if (paymentGateway.processPayment(user, amount)) {
            Booking booking = new Booking(1L, user, show, seats, amount, BookingStatus.CONFIRMED);
            return booking;
        }
        throw new RuntimeException("Payment failed");
    }
}