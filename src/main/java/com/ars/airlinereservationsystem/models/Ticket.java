package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.TicketStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;
    private LocalTime boardingTime;

    @ManyToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;
/*    private Integer profileId;*/
/*    private Integer flightId;
    private LocalDateTime flightDepartureDate;*/
    private TicketStatus status;
    }
