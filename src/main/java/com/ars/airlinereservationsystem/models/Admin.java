package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Role;
import lombok.Data;

import javax.persistence.*;

@Entity
public class Admin extends Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    @Enumerated(EnumType.STRING)
    private Role role;



}
