package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Ticket;
import com.ars.airlinereservationsystem.repositories.TicketRepository;
import com.ars.airlinereservationsystem.service.TicketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServicesImpl implements TicketServices {

   @Autowired
   private TicketRepository ticketRepository;

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);

    }

    @Override
    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Integer ticketId) {
        return null;
    }

    @Override
    public void deleteTicketById(Integer ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
