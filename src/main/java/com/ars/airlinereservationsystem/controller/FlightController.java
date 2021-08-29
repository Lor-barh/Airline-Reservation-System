package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Airline;
import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.SearchBean;
import com.ars.airlinereservationsystem.service.AirlineService;
import com.ars.airlinereservationsystem.service.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FlightController {
    @GetMapping("/create-flight")
    public String flightCreationPage(Model model){
        model.addAttribute("flightData", new Flight());
        model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        return "create-flight";
    }
    private final FlightServices flightServices;
    private final AirlineService airlineService;
    @Autowired
    public FlightController(FlightServices flightServices, AirlineService airlineService) {
        this.flightServices = flightServices;
        this.airlineService = airlineService;
    }

    @PostMapping("/searchFlight")
    public String searchFlights(@ModelAttribute("flightSearchData") SearchBean searchBean, Model model,HttpSession session){
        Passenger passenger = (Passenger) session.getAttribute("passengerData");
        session.setAttribute("flightList",flightServices.searchFlight(searchBean));
        if(passenger!=null){


            return "redirect:/passenger_homepage";

        }
        return "redirect:/";


    }
    @PostMapping("/createFlight")
    public String createFlight(@ModelAttribute("flightData") Flight flight,Model model){
        flightServices.createFlight(flight);
        return "admin-dashboard";
    }
    @PostMapping("/addAirline")
    public String createFlight(@ModelAttribute("airlineData") Airline airline,Model model){
        //model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        airlineService.addNewAirline(airline);
        return "/admin-dashboard";
    }
    @GetMapping("/passenger_homepage")
    public String passengerHomepage(@ModelAttribute("flightSearchData") SearchBean searchBean,Model model,HttpSession session){
        model.addAttribute("flightList",session.getAttribute("flightList"));
        model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        model.addAttribute("passengerData", new Passenger());
        model.addAttribute("flightData", new Flight());
        model.addAttribute("flightBookingData", new Flight());
        model.addAttribute("flightSearchData", new SearchBean());
        model.addAttribute("listOfFlightsCreated",flightServices.getAllFlights());
        return "passenger_homepage";
    }

}
