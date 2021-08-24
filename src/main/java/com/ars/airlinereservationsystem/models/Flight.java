package com.ars.airlinereservationsystem.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;
    private String flightCode;
    private Integer availableSeat;
    private String Status;
    private String source;
    private String destination;
    private LocalTime departure_time;
    private LocalTime return_time;
    private String duration;
    private Integer total_seats;
    private Double price;

    @ManyToOne
    private Airline airline;
    @OneToMany
    private Set<Passenger> passengers;

}
