package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;
import com.ars.airlinereservationsystem.models.SearchBean;
import com.ars.airlinereservationsystem.repositories.FlightRepository;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.service.FlightServices;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Service
public class PassengerServicesImpl implements PassengerServices {

    @Autowired
    private PassengerRepository passengerRepository;
    private FlightServices flightServices;

    @Override
    public String register(Passenger passenger,Model model) {
        model.addAttribute("passengerData", new Passenger());
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
    public String login(Passenger savedPassenger,HttpSession session, Model model) {
        String redirect = "redirect:/";
        Passenger passenger = (Passenger) session.getAttribute("passengerData");
        //model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        //model.addAttribute("flightList",flightServices.searchFlight(searchBean));
        if(savedPassenger != null){

            Passenger currentPassenger = passengerRepository.findByEmailAndPassword
                    (savedPassenger.getEmail(), savedPassenger.getPassword());

            if(passenger != null){

                return "redirect:/passenger_homepage";

            }else{

                session.setAttribute("passengerData", currentPassenger);
                return "redirect:/passenger_homepage";

            }
        }
        return redirect;
    }

    @Override
    public Passenger updateProfile(Passenger passenger) {
        return null;
    }

    @Override
    public Passenger bookFlight() {
        return null;
    }

    @Override
    public Passenger getAPassenger(String email, String password) {
        return passengerRepository.findByEmailAndPassword(email,password);
    }

}
