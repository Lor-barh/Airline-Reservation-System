package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
