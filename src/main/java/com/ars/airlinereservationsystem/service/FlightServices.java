package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Flight;
import java.util.List;


public interface FlightServices {
    void saveFlight(Flight flight);
    List<Flight> getAllFlight();
    Flight getFlightById(Integer flightId);
    void deleteFlightById(Integer FlightId);
}
