package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.SearchBean;

import java.util.List;

public interface FlightServices {
    List<Flight> searchFlight(SearchBean searchBean);
    void createFlight(Flight flight);
    List<Flight> getAllFlights();
}
