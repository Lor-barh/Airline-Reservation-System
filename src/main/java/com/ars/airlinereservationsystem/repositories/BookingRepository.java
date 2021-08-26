package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Booking;
import com.ars.airlinereservationsystem.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    Optional<Booking> findBookingByBookngId(Integer bookingId);
    Optional <Booking> findBookingByBookngIdAndPassenger(Integer bookngId, Passenger passenger);

}
