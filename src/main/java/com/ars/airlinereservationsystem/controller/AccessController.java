package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.enums.Role;
import com.ars.airlinereservationsystem.models.Admin;
import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.service.AdminServices;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AccessController {


    private final PassengerServices passengerServices;
    private final AdminServices adminServices;

    @Autowired
    public AccessController(PassengerServices passengerServices, AdminServices adminServices) {
        this.passengerServices = passengerServices;
        this.adminServices = adminServices;
    }

    @GetMapping("/")
    public String landingPage(Model model){
        model.addAttribute("passengerData", new Passenger());
        model.addAttribute("flightData", new Flight());
        return "index";
    }

    @GetMapping("/Admin")
    public String adminLogin(Model model){
        model.addAttribute("adminData", new Admin());
        return "admin_login";
    }

    @PostMapping("/passengerLogin")
    public String userLogin(@ModelAttribute ("passengerData") Passenger passenger, HttpSession session){
        System.out.println("====> "+passenger.getEmail());
        System.out.println("====> "+passenger.getPassword());
        return passengerServices.login(passenger,session);
    }

    @PostMapping("/adminLogin")
    public String userLogin(@ModelAttribute("adminData") Admin admin, HttpSession session){
        return adminServices.login(admin,session);
    }

    @RequestMapping("/registration")
    public String passengerRegistration(@ModelAttribute("registration")Passenger passenger){
        System.out.println("registration===> "+passenger.getContact());
        System.out.println("registration===> "+passenger.getEmail());
        return passengerServices.register(passenger);
    }

}
