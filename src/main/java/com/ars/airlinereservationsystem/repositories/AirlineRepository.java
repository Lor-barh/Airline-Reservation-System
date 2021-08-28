package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {
}
