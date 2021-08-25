package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.repositories.FlightRepository;
import com.ars.airlinereservationsystem.service.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightServices {
    private final FlightRepository flightRepository;
    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> searchFlight(Flight flight) {
        return flightRepository.findAllBySourceOrDestinationOrDeparture_timeOrReturn_time(flight);
    }

    @Override
    public void createFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}
