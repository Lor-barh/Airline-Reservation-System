package com.ars.airlinereservationsystem.repositories;
import com.ars.airlinereservationsystem.models.CreditCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardDetailsRpository extends JpaRepository<CreditCardDetails, Integer> {
}
