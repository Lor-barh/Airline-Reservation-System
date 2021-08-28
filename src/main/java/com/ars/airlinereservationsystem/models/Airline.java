package com.ars.airlinereservationsystem.models;


import com.ars.airlinereservationsystem.enums.Airplane;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Entity
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airlineId;
    private String airlineName;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Airplane> airplanes;
//    @ElementCollection // 1
//    @CollectionTable(name = "my_list", joinColumns = @JoinColumn(name = "id")) // 2
//    @Column(name = "list")
}
