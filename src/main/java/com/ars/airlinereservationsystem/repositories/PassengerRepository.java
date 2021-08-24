package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository <Passenger, Integer> {



}
