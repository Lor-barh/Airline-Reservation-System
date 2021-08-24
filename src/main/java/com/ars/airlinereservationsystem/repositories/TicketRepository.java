package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
