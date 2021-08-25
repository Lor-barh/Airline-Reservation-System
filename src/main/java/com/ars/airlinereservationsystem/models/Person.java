package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Role;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@MappedSuperclass
public class Person {


    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String address;
    private String contact;

}
