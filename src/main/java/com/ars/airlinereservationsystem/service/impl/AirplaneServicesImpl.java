/*
package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Airplane;
import com.ars.airlinereservationsystem.repositories.AirplaneRepository;
import com.ars.airlinereservationsystem.service.AirplaneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneServicesImpl implements AirplaneServices {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Override
    public void saveAirline(Airplane airplane) {
        airplaneRepository.save(airplane);
    }

    @Override
    public List<Airplane> getAllAirplane() {
        return airplaneRepository.findAll();
    }

    @Override
    public Airplane getAirplaneById(Integer airplaneId) {
        return null;
    }

    @Override
    public void deleteAirplaneById(Integer airplaneId) {
        airplaneRepository.deleteById(airplaneId);
    }
}
*/
