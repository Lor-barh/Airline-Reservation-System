package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Ticket;
import java.util.List;

public interface TicketServices {
    void saveTicket(Ticket ticket);
    List<Ticket> getAllTicket();
    Ticket getTicketById(Integer ticketId);
    void deleteTicketById(Integer ticketId);
}
