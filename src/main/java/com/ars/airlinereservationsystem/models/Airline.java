package com.ars.airlinereservationsystem.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airlineId;
    private String airlineName;

    @OneToMany
    private List<Flight> flights;

    @OneToMany
    private Set<Airplane> airplanes;
}
