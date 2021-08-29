package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.enums.Places;
import com.ars.airlinereservationsystem.enums.TravelClass;
import com.ars.airlinereservationsystem.enums.TravelType;
import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.Passenger;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
    List<Flight> findAllBySourceOrDestinationOrTravelDateOrComingBackDateOrTravelType(Places source, Places destination, String travelDate, String comingBackDate, TravelType travelType);
    Flight findFlightByFlightId(Integer flightId);
}
