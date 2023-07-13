package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Getter
    private Integer number;

    @OneToMany
    private List<Seat> seats;
}
