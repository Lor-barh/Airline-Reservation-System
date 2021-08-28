package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Airline;
import java.util.List;

public interface AirlineServices {
    void saveAirline(Airline airline);
    List<Airline> getAllAirline();
    Airline getAirlineById(Integer airlineId);
    void deleteAirlineById(Integer airlineId);
}
