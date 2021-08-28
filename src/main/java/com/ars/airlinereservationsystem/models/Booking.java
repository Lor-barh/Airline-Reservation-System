package com.ars.airlinereservationsystem.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Booking {

    @Id
    private Integer bookingId;

    @OneToOne
    private Flight flight;

    @ManyToOne
    private Passenger passenger;


}
