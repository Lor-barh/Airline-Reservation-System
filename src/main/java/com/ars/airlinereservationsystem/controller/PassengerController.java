package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PassengerController {

    private PassengerRepository passengerRepository;
    private PassengerServices passengerServices;

    @Autowired
    public PassengerController(PassengerRepository passengerRepository, PassengerServices passengerServices) {
        this.passengerRepository = passengerRepository;
        this.passengerServices = passengerServices;
    }

    @RequestMapping("/registration")
    public String passengerRegistration(@ModelAttribute("registration")Passenger passenger){
        Passenger newPassenger = new Passenger();
        newPassenger.setFirstName(passenger.getFirstName());
        newPassenger.setLastName(passenger.getLastName());
        newPassenger.setEmail(passenger.getEmail());
        newPassenger.setPassword(passenger.getPassword());
        newPassenger.setAddress(passenger.getAddress());
        newPassenger.setContact(passenger.getContact());
        newPassenger.setRole(passenger.getRole());
        passengerServices.save(newPassenger);
        return "redirect:/passenger_dashboard";
    }
}
