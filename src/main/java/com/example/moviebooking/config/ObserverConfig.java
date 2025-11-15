package com.example.moviebooking.config;

import com.example.moviebooking.notificationService.BookingNotificationService;
import com.example.moviebooking.notificationService.EmailNotifier;
import com.example.moviebooking.notificationService.SMSNotifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObserverConfig {

    @Bean
    public EmailNotifier emailNotifier() {
        return new EmailNotifier();
    }

    @Bean
    public SMSNotifier smsNotifier() {
        return new SMSNotifier();
    }

    @Bean
    public CommandLineRunner registerObservers(
            BookingNotificationService service,
            EmailNotifier email,
            SMSNotifier sms) {

        return args -> {
            service.addObserver(email);
            service.addObserver(sms);
        };
    }
}

