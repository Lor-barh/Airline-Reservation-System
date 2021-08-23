package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Role;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contact;
    @Enumerated(EnumType.STRING)
    private Role role;
}
