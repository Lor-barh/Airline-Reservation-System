package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private Date travelDate;
    private Date comingBackDate;
    private LocalTime departureTime;
    private LocalTime returnTime;
    private TravelType travelType;
    private TravelClass travelClass;
    private String duration;
    private Integer totalSeats;
    private Double price;

    @ManyToOne
    private Airline airline;
    @OneToMany
    private Set<Passenger> passengers;

}
