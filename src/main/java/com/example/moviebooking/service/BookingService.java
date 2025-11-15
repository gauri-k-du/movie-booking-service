package com.example.moviebooking.service;
import com.example.moviebooking.addon.*;
import com.example.moviebooking.factory.TicketFactory;
import com.example.moviebooking.model.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.example.moviebooking.notificationService.BookingNotificationService;
import com.example.moviebooking.strategyInterface.IPricingStrategy;
import com.example.moviebooking.strategyInterface.IPaymentGateway;
import com.example.moviebooking.theatre.Row;
import com.example.moviebooking.theatre.TheatreScreen;
import com.example.moviebooking.theatre.TheatreSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import static com.example.moviebooking.model.Booking.*;
@Service
public class BookingService {
    private final BookingNotificationService notificationService;

    public BookingService(BookingNotificationService notificationService) {
        this.notificationService = notificationService;
    }


//    private final IPricingStrategy pricingStrategy;
//    private final IPaymentGateway paymentGateway;

//    public BookingService(IPricingStrategy pricingStrategy, IPaymentGateway paymentGateway) {
//        this.pricingStrategy = pricingStrategy;
//        this.paymentGateway = paymentGateway;
//    }

    public Booking bookSeats(User user, Show show, List<Seat> seatNumbers, String ticketType,String addonName) {



        //factory
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



        // Benefit	Explanation
        //Uniformity	Seat, Row, and Screen all behave as TheatreComponent
        //Extensible	New types (VIPRow, Balcony) simply extend Composite
        //Tree Operations	Count seats, print layout, pricing per row
        //Reusability	Same interface across the hierarchy
        //Clean, Maintainable Code	No if-else checks to see if it’s seat or row
        TheatreScreen screen1 = new TheatreScreen("Screen 1");

        Row rowA = new Row("A");
        rowA.addSeat(new TheatreSeat("A1"));
        rowA.addSeat(new TheatreSeat("A2"));

        Row rowB = new Row("B");
        rowB.addSeat(new TheatreSeat("B1"));
        rowB.addSeat(new TheatreSeat("B2"));

        screen1.addRow(rowA);
        screen1.addRow(rowB);

        screen1.showLayout();
        System.out.println("Total Seats: " + screen1.getSeatCount());



        Booking booking =  Booking.builder()
                .id(random)
                .user(user)
                .show(show)
                .totalPrice(total)
                .build();
        notificationService.notifyObservers(booking);
        return booking;
    }
}