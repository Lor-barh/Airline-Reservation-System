package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRpository extends JpaRepository<Flight, Integer> {
}
