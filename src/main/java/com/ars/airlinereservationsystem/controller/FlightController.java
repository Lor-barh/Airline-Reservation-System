package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.service.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightController {
    private final FlightServices flightServices;
    @Autowired
    public FlightController(FlightServices flightServices) {
        this.flightServices = flightServices;
    }
    @PostMapping("/searchFlight")
    public String searchFlights(@ModelAttribute("flightData")Flight flight, Model model){
        model.addAttribute("flightList",flightServices.searchFlight(flight));
        return "index";
    }
    @PostMapping("/createFlight")
    public String createFlight(@ModelAttribute("flightData") Flight flight,Model model){
        model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        flightServices.createFlight(flight);
        return "redirect:/admin-dashboard";
    }
}
