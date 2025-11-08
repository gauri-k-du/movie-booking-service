package com.example.moviebooking.model;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// No need for Lombok's @Builder here since you're implementing the builder manually
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    private String id;
    private User user;
    private Show show;
    private List<Seat> seats;
    private double totalPrice;
    private String status;
    private List<Ticket> tickets;

    // --- Custom Builder Implementation ---
    public static class Builder {
        private String id;
        private User user;
        private Show show;
        private List<Seat> seats;
        private List<Ticket> tickets;
        private double totalPrice;
        private String status;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder show(Show show) {
            this.show = show;
            return this;
        }

        public Builder tickets(List<Ticket> tickets) {
            this.tickets = tickets;
            return this;
        }

        public Builder seats(List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Booking build() {
            Booking booking = new Booking();
            booking.id = this.id;
            booking.user = this.user;
            booking.show = this.show;
            booking.tickets = this.tickets;
            booking.seats = this.seats;
            booking.totalPrice = this.totalPrice;
            booking.status = this.status;
            return booking;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
