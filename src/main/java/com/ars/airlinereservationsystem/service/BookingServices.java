package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.models.Flight;

import java.util.List;

public interface BookingServices {

    Booking saveBooking(Booking booking);
    void cancelFlight(Integer bookingId);
    Booking rescheduleFlight(Integer bookingId);
    List<Booking> getAllBookings();
}
