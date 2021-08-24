package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.enums.Role;
import com.ars.airlinereservationsystem.models.Admin;
import com.ars.airlinereservationsystem.models.Person;
import com.ars.airlinereservationsystem.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String viewLandingPage(Model model){
        model.addAttribute("landing_page");
        return "index";
    }

    @GetMapping("/login")
    public String logIn(Model model){
        model.addAttribute("login", new Person());
        return "login";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute ("userLogin") Person person, HttpSession session){
        String role;
        Person user = personRepository.findByEmailAndPassword
                (person.getEmail(), person.getPassword());
        session.setAttribute("user", user);
        if (person.getRole().equals(Role.ADMIN)){
            role = "redirect:/admin_dashboard";
        } else
            role = "redirect:/passenger_dashboard";
        return role;
    }

}
