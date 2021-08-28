package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirlineRepository extends JpaRepository<Airline,Integer> {
    Airline findAirlineByAirlineName(String airlineName);
    List<Airline> findAll();
    List<Airline> findAirlinesByAirlineName(String airlineName);
}
