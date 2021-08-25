package com.ars.airlinereservationsystem.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airplaneId;
    private String airplaneName;
    private Integer capacity;

   @ManyToOne
    private Airline airline;
}
