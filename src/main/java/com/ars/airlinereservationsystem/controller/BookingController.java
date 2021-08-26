package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.service.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookingController {

    @Autowired
    BookingServices bookingServices;

    @GetMapping("/createBooking")
    public String showBookingList(Model model){

        Booking booking = new Booking();
        model.addAttribute("booking", booking);
        return "bookingList";
    }

    @RequestMapping("/saveBooking")
    public String saveBooking(@ModelAttribute("booking")Booking booking){
        Booking newBooking = new Booking();
        newBooking.setFlight(booking.getFlight());
        newBooking.setPassenger(booking.getPassenger());
        bookingServices.saveBooking(newBooking);
        return "redirect:/passengerLogin";
    }

    @GetMapping("/cancel/{bookingId}")
    public String cancelFlight(@PathVariable(name = "bookingId") Integer bookingId, Model model) {

        this.bookingServices.cancelFlight(bookingId);
        return "bookingList";
    }

    @GetMapping("/reschedule/{bookingId}")
    public String rescheduleFlight(@PathVariable (name = "bookingId") Integer bookingId, Model model){

        Booking booking = bookingServices.rescheduleFlight(bookingId);
        //set employee as a model attribute to pre-populate the form
        model.addAttribute("booking", booking);
        return "redirect:/";
    }

}
