package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class PassengerServicesImpl implements PassengerServices {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public String register(Passenger passenger) {
        Passenger newPassenger = new Passenger();
        newPassenger.setFirstName(passenger.getFirstName());
        newPassenger.setLastName(passenger.getLastName());
        newPassenger.setEmail(passenger.getEmail());
        newPassenger.setPassword(passenger.getPassword());
        newPassenger.setAddress(passenger.getAddress());
        newPassenger.setContact(passenger.getContact());
        passengerRepository.save(newPassenger);
        return "redirect:/homepage";
    }

    @Override
    public String login(Passenger passenger, HttpSession session) {
        String redirect = "";
        if(passenger != null){
            Passenger currentPassenger = passengerRepository.findByEmailAndPassword
                    (passenger.getEmail(), passenger.getPassword());

            if (currentPassenger != null){
                System.out.println(currentPassenger.getEmail());
                System.out.println(currentPassenger.getPassword());
                session.setAttribute("passengerData", currentPassenger);
                redirect = "passenger_homepage";
            }else{
                redirect = "index";
            }
        }
        return redirect;
    }

    @Override
    public void logout(Passenger passenger) {

    }

    @Override
    public Passenger updateProfile(Passenger passenger) {
        return null;
    }

    @Override
    public Passenger bookFlight() {
        return null;
    }

}
