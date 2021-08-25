package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

//    @GetMapping("/")
//    public String viewLandingPage(Model model){
//        model.addAttribute("landing_page");
//        return "index";
//    }


}
