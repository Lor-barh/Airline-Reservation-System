package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface PassengerServices {
    String register(Passenger passenger,Model model);
    String login(Passenger passenger, HttpSession session, Model model);
    Passenger updateProfile(Passenger passenger);
    Passenger bookFlight();
}
