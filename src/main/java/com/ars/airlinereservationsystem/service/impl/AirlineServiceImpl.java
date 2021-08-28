package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.repositories.AirlineRepository;
import com.ars.airlinereservationsystem.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService {
    private final AirlineRepository airlineRepository;
    @Autowired
    public AirlineServiceImpl(AirlineRepository airlineRepository){
        this.airlineRepository = airlineRepository;
    }
    @Override
    public void addNewAirline(Airline airline) {
        airlineRepository.save(airline);
    }
    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

}
