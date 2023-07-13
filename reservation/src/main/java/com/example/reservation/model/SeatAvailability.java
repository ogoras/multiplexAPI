package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class SeatAvailability {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    private Seat seat;

    @NonNull
    @ManyToOne
    private Screening screening;

    @NonNull
    @Getter
    private Boolean available;
}
