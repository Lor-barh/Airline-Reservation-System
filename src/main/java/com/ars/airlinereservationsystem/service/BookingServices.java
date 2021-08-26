package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Booking;

public interface BookingServices {

    Booking saveBooking(Booking booking);
    void cancelFlight(Integer bookingId);
    Booking rescheduleFlight(Integer bookingId);
}
