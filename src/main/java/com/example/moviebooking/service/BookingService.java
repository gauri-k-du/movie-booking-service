package com.example.moviebooking.service;
import com.example.moviebooking.addon.*;
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

    public Booking bookSeats(User user, Show show, List<Seat> seatNumbers, String ticketType,String addonName) {
        List<Ticket> tickets = seatNumbers.stream()
                .map(seat -> TicketFactory.createTicket(ticketType, "2", 250.0))
                .collect(Collectors.toList());


        String random = UUID.randomUUID().toString().replace("-", "");
        System.out.println("random"+random);
        double total = 0;

        for (Ticket ticket : tickets) {
        PriceComponent priceComponent = new TicketPriceAdapter(ticket);
            //Feature	Pattern
            //Ticket creation	Factory
            //Add-ons pricing	Decorator
            //Building Booking object	Builder
            //Single BookingService instance	(if used) Singleton
            if(addonName!=null && addonName.equals("coke")){
                priceComponent = new CokeAddOn(priceComponent);
            }
            if(addonName!=null && addonName.equals("popcorn")) {
                priceComponent = new PopcornAddOn(priceComponent);
            }
            System.out.println(priceComponent.getPrice());

            total += priceComponent.getPrice();
        }



//        double total = tickets.stream().mapToDouble(Ticket::getPrice).sum();

        return Booking.builder()
                .id(random)
                .user(user)
                .show(show)
                .totalPrice(total)
                .build();
    }
}