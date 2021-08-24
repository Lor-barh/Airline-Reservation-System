package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Airplane;

import java.util.List;


public interface AirplaneServices {
    void saveAirline(Airplane airplane);
    List<Airplane> getAllAirplane();
    Airplane getAirplaneById(Integer airplaneId);
    void deleteAirplaneById(Integer airplaneId);
}
