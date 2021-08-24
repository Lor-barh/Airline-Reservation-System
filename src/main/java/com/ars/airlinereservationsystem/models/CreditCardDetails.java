package com.ars.airlinereservationsystem.models;


import com.ars.airlinereservationsystem.enums.CardType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class CreditCardDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer card_id;
    private Long card_number;
    private CardType card_type;
    private Integer expiration_month;
    private Integer expiration_year;
    private Double balance;

    @ManyToMany
    private List<Passenger> passenger;
}
