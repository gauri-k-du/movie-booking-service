package com.example.moviebooking;

import com.example.moviebooking.notificationService.BookingNotificationService;
import com.example.moviebooking.notificationService.EmailNotifier;
import com.example.moviebooking.notificationService.SMSNotifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieBookingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieBookingServiceApplication.class, args);
    }

}
