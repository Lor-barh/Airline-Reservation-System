package com.ars.airlinereservationsystem.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Message {

    @Id
    private Integer messageId;
    private String subject;
    private String message;
    private LocalDateTime messageTime;

    @ManyToOne
    private Passenger passenger;

}
