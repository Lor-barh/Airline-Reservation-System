package com.ars.airlinereservationsystem.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin extends Person {


    @Id
    private Integer adminId;



}
