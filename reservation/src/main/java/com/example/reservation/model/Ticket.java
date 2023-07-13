package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    private Seat seat;

    @NonNull
    @ManyToOne
    private Reservation reservation;

    @NonNull
    @Getter
    private Integer type;
}
