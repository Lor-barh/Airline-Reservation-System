package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Booking;
import java.util.List;


public interface BookingServices {
    void saveBooking(Booking booking);
    List<Booking> getAllBooking();
    Booking getBookingById(Integer bookingId);
    void deleteBookingById(Integer bookingId);
    void cancelBooking(Integer flightId);
    void rescheduleFlight(Booking booking);
}
