package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Flight;
import com.ars.airlinereservationsystem.models.SearchBean;
import com.ars.airlinereservationsystem.repositories.AirlineRepository;
import com.ars.airlinereservationsystem.repositories.FlightRepository;
import com.ars.airlinereservationsystem.service.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightServices {
    private final FlightRepository flightRepository;
    private final AirlineRepository airlineRepository;
    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository,AirlineRepository airlineRepository) {

        this.flightRepository = flightRepository;
        this.airlineRepository = airlineRepository;

    }

    @Override
    public List<Flight> searchFlight(SearchBean searchBean) {
        //Departure_timeAndReturn_timeAnd
        Flight flight = new Flight();
        flight.setSource(searchBean.getSource());
        flight.setDestination(searchBean.getDestination());
        flight.setTravelDate(searchBean.getTravelDate());
        flight.setComingBackDate(searchBean.getComingBackDate());
        flight.setTravelType(searchBean.getTravelType());
        flight.setTravelClass(searchBean.getTravelClass());
 /*       flight.set(searchBean.getSource());
        flight.setSource(searchBean.getSource());
        flight.setSource(searchBean.getSource());
        flight.setSource(searchBean.getSource());*/

        return flightRepository.findAllBySourceOrDestinationOrTravelDateOrComingBackDateOrTravelType(flight.getSource(), flight.getDestination(),flight.getTravelDate(),flight.getComingBackDate(),flight.getTravelType());
    }

    @Override
    public void createFlight(Flight flight) {
        Flight flight1 = new Flight();
        flight1.setFlightCode(flight.getFlightCode());
        flight1.setSource(flight.getSource());
        flight1.setDestination(flight.getDestination());
        flight1.setTravelDate(flight.getTravelDate());
        flight1.setComingBackDate(flight.getComingBackDate());
        flight1.setAvailableSeat(flight.getAirplane().getCapacity());
        flight1.setTravelType(flight.getTravelType());
        flight1.setTravelClass(flight.getTravelClass());
        flight1.setDepartureTime(flight.getDepartureTime());
        flight1.setReturnTime(flight.getReturnTime());
        flight1.setTotalSeats(flight.getAirplane().getCapacity());
        flight1.setAirplane(flight.getAirplane());
        flight1.setDuration(flight.getDuration());
        flight1.setPrice(flight.getPrice());
        flightRepository.save(flight1);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}
