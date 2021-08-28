package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.models.Flight;

import java.util.List;

public interface AirlineService {
    void addNewAirline(Airline airline);
    List<Airline> getAllAirlines();
}
