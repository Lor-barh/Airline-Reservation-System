package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.repositories.AirlineRepository;
import com.ars.airlinereservationsystem.service.AirlineServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServicesImpl implements AirlineServices {

    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public void saveAirline(Airline airline) {airlineRepository.save(airline);}

    @Override
    public List<Airline> getAllAirline() {return airlineRepository.findAll();}

    @Override
    public Airline getAirlineById(Integer airlineId) {
        return null;
    }

    @Override
    public void deleteAirlineById(Integer airlineId) {
        airlineRepository.deleteById(airlineId);

    }
}
