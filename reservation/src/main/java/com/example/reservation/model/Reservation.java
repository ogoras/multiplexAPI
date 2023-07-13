package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @Getter
    @Setter
    private List<Ticket> tickets;

    @NonNull
    @ManyToOne
    private Screening screening;

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date expirationTime;
}
