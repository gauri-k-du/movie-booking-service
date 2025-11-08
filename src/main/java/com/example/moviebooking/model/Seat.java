package com.example.moviebooking.model;

import jakarta.persistence.*;
import lombok.*;
import com.example.moviebooking.model.SeatType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {

    @Id
    private int id;
    private String seatNumber;
    private String type; // REGULAR, VIP
    private String status; // AVAILABLE, BOOKED
    private String seatType;

    public Seat(int id, String seatNumber, String seatType) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}