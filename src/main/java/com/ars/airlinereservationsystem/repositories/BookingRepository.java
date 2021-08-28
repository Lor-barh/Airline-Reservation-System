package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findAll();
}
