package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    @Getter
    private Room room;

    @NonNull
    @Getter
    private Integer row;

    @NonNull
    @Getter
    // number in row
    private Integer number;
}
