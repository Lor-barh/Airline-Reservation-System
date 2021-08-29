package com.ars.airlinereservationsystem.controller;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.service.BookingServices;
import com.ars.airlinereservationsystem.service.FlightServices;
import com.ars.airlinereservationsystem.service.PassengerServices;
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

    BookingServices bookingServices;
    PassengerServices passengerServices;
    FlightServices flightServices;

    @Autowired
    public BookingController(BookingServices bookingServices, PassengerServices passengerServices, FlightServices flightServices) {
        this.bookingServices = bookingServices;
        this.passengerServices = passengerServices;
        this.flightServices = flightServices;
    }

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
        return "passenger-history";
    }

    @GetMapping("/book/{flightId}")
    public String book(@PathVariable(name = "flightId") Integer flightId, Model model, HttpSession httpSession){
        Passenger loginPassenger = (Passenger) httpSession.getAttribute("passengerData");
        System.out.println("<==== not login ====>"+flightId);

        if(loginPassenger!=null){
            System.out.println("<==== <> ====>"+flightId);
            Passenger currentPassenger = passengerServices.getAPassenger(loginPassenger.getEmail(),loginPassenger.getPassword());
            if(currentPassenger != null){
                Booking newBooking = new Booking();
                newBooking.setFlight(flightServices.getFlightById(flightId));
                newBooking.setPassenger(loginPassenger);
                bookingServices.saveBooking(newBooking);
                model.addAttribute("bookingList", bookingServices.getAllBooking());
                return "redirect:/viewBookingHistory";
            }else{
                return "redirect:/";
            }
        }
        return "redirect:/";

    }

/*    @RequestMapping("/saveBooking")
    public String saveBooking(@ModelAttribute("booking")Booking booking){
        Booking newBooking = new Booking();
        newBooking.setFlight(booking.getFlight());
        newBooking.setPassenger(booking.getPassenger());
        bookingServices.saveBooking(newBooking);
        return "redirect:/createBooking";
    }*/

    @GetMapping("/cancel/{bookingId}")
    public String cancelFlight(@PathVariable(name = "bookingId") Integer bookingId, Model model) {

        this.bookingServices.cancelBooking(bookingId);
        return "redirect:/viewBookingHistory";
    }

    @GetMapping("/reschedule/{bookingId}")
    public String rescheduleFlight(@PathVariable (name = "bookingId") Integer bookingId, Model model){
        bookingServices.rescheduleFlight(bookingServices.getBookingById(bookingId));
        model.addAttribute("booking", bookingServices.getBookingById(bookingId));
        return "redirect:/viewBookingHistory";
    }

    /*@GetMapping("/reschedule/{bookingId}")
    public String reschedule(@PathVariable (name = "bookingId") Integer bookingId, Model model){
        model.addAttribute("booking", bookingServices.getBookingById(bookingId));
        model.addAttribute("flightData",flightServices.getFlightById(bookingServices.getBookingById(bookingId).getFlight().getFlightId()));
        return "reschedule_flight";
    }*/

}
