package com.example.reservation.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Screening {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    @Getter
    private Movie movie;

    @NonNull
    @ManyToOne
    @Getter
    private Room room;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    private java.util.Date startTime;

    @OneToMany
    @Getter
    @Setter
    private List<SeatAvailability> seatAvailabilityList;
}
