package com.ars.airlinereservationsystem.models;

import com.ars.airlinereservationsystem.enums.Airplane;
import com.ars.airlinereservationsystem.enums.Places;
import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SearchBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer searchId;
    private Places source;
    private Places destination;
    private String travelDate;
    private String  comingBackDate;
    private String  departureTime;
    private String returnTime;
    @Enumerated(EnumType.STRING)
    private TravelType travelType;
    @Enumerated(EnumType.STRING)
    private TravelClass travelClass;
    private Integer noOfKids;
    private Integer noOfAdults;
    private Integer noOfSeniors;
}
