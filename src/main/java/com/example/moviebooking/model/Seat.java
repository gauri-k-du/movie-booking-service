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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seatNumber;
    private String type; // REGULAR, VIP
    private String status; // AVAILABLE, BOOKED
    private SeatType seatType;

}