package com.ars.airlinereservationsystem.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Passenger extends Person{

    @Id
    private Integer passengerId;

}
