package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;

import javax.servlet.http.HttpSession;

public interface PassengerServices {
    String register(Passenger passenger);
    String login(Passenger passenger, HttpSession session);
    void logout(Passenger passenger);
    Passenger updateProfile(Passenger passenger);
    Passenger bookFlight();
}
