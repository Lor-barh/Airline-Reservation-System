package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.repositories.BookingRepository;
import com.ars.airlinereservationsystem.service.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServicesImpl implements BookingServices {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Integer bookingId) {
        return null;
    }

    @Override
    public void deleteBookingById(Integer bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}
