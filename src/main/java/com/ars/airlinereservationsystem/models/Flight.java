package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
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
//    private LocalTime departureBoardingTime;
//    private LocalTime returnBoardingTime;
    private TravelType travelType;
    private TravelClass travelClass;
    private LocalDateTime departure_time;
    private LocalDateTime return_time;
    private String duration;
    private Integer total_seats;
    private Double price;

    @ManyToOne
    private Airline airline;
    @OneToMany
    private Set<Passenger> passengers;

}
