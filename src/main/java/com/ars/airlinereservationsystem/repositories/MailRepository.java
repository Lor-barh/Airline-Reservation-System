package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Integer> {
}
