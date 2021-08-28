package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Airplane;
import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
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
    private String travelDate;
    private String  comingBackDate;
    private String  departureTime;
    private String returnTime;
    @Enumerated(EnumType.STRING)
    private TravelType travelType;
    @Enumerated(EnumType.STRING)
    private TravelClass travelClass;
    private String duration;
    private Integer totalSeats;
    private Double price;
    private String airline;
    @Enumerated(EnumType.STRING)
    private Airplane airplane;
    @OneToMany
    private Set<Passenger> passengers;

}
