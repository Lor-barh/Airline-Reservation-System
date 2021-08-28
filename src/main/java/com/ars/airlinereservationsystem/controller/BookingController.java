package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.service.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BookingController {

    @Autowired
    BookingServices bookingServices;

    @GetMapping("/homepage")
    public String showHomePage(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        Passenger passengerSession = (Passenger) session.getAttribute("passenger");
        model.addAttribute("passenger_homepage",passengerSession);
        return "passenger_homepage";
    }

    @GetMapping("/viewBookingHistory")
    public String showBookingList(Model model){
        model.addAttribute("bookingList", bookingServices.getAllBooking());
        return "passenger-dashboard";
    }

    @RequestMapping("/saveBooking")
    public String saveBooking(@ModelAttribute("booking")Booking booking){
        Booking newBooking = new Booking();
        newBooking.setFlight(booking.getFlight());
        newBooking.setPassenger(booking.getPassenger());
        bookingServices.saveBooking(newBooking);
        return "redirect:/createBooking";
    }

    @GetMapping("/cancel/{bookingId}")
    public String cancelFlight(@PathVariable(name = "bookingId") Integer bookingId, Model model) {

        this.bookingServices.cancelBooking(bookingId);
        return "redirect:/createBooking";
    }

    @GetMapping("/reschedule/{bookingId}")
    public String rescheduleFlight(@PathVariable (name = "bookingId") Integer bookingId, Model model){

        //Booking booking = bookingServices.rescheduleFlight(bookingId);
        //model.addAttribute("booking", booking);
        return "redirect:/createBooking";
    }

}
