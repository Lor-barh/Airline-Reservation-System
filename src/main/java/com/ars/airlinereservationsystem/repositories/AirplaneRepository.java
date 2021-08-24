package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, Integer> {
}
