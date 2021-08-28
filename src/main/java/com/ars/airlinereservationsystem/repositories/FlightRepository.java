package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
/*    private Integer flightId;
    private String flightCode;
    private Integer availableSeat;
    private String Status;
    private String source;
    private String destination;
    private LocalTime departure_time;
    private LocalTime return_time;
    private String duration;
    private Integer total_seats;
    private Double price;
    @ManyToOne
    private Airline airline;
    @OneToMany
    private Set<Passenger> passengers;*/
    //AndDeparture_timeAndReturn_time
    List<Flight> findAllBySourceAndDestinationAndTravelDateAndAndComingBackDateAndTravelTypeAndTravelClass(String source, String destination, String travelDate,String comingBackDate,TravelType travelType, TravelClass travelClass);
}
