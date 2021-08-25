package com.ars.airlinereservationsystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Passenger extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passengerId;

    @ManyToMany
    private Set<CreditCardDetails> creditCardDetails;

    @OneToMany
    private Set<Ticket> tickets;

    @OneToMany
    private Set<Flight> flights;

    @OneToMany
    private List<Message> messages;

    @OneToMany
    private Set<Booking> bookings;

}
