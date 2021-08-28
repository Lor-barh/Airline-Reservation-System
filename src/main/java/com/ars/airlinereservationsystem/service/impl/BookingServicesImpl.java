package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.exceptions.ResourceNotFoundException;
import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.repositories.BookingRepository;
import com.ars.airlinereservationsystem.service.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServicesImpl implements BookingServices {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public void cancelFlight(Integer bookingId) {
        this.bookingRepository.deleteById(bookingId);
    }

    @Override
    public Booking rescheduleFlight(Integer bookingId) {
        Optional <Booking> newBookingId = bookingRepository.findBookingByBookngId(bookingId);
        Booking booking;
        if (newBookingId.isPresent()){
            booking = newBookingId.get();
        } else
            throw new ResourceNotFoundException("Booking with booking-id " + bookingId + "not found");
        return booking;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
