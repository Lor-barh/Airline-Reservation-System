package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Role;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@MappedSuperclass
public class Person {

    @NotNull
    @Size(min = 3, max = 50)
    private String firstName;
    @NotNull
    @Size(min = 3, max = 50)
    private String lastName;
    @NotNull
    @Email(message = "{invalid.email}")
    private String email;
    @NotNull
    @Size(min = 8, max = 50)
    private String password;
    private String address;
    private String contact;
    @Enumerated(EnumType.STRING)
    private Role role;
}
