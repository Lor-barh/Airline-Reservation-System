package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Flight;

import java.util.List;

public interface FlightServices {
    List<Flight> searchFlight(Flight flight);
    void createFlight(Flight flight);
    List<Flight> getAllFlights();
}
