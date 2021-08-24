package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.repositories.FlightRpository;
import com.ars.airlinereservationsystem.service.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServicesImpl implements FlightServices {

    @Autowired
    private FlightRpository flightRpository;

    @Override
    public void saveFlight(Flight flight) {
        flightRpository.save(flight);
    }

    @Override
    public List<Flight> getAllFlight() {
        return flightRpository.findAll();
    }

    @Override
    public Flight getFlightById(Integer flightId) {
        return null;
    }

    @Override
    public void deleteFlightById(Integer flightId) {
        flightRpository.deleteById(flightId);
    }
}
