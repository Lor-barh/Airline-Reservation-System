package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.CreditCardDetails;

import java.util.List;

public interface CreditCardDetailsServices {
    void saveCreditCardDetails(CreditCardDetails creditCardDetails);
    List<CreditCardDetails> getAllCreditCardDetails();
    CreditCardDetails getCreditCardDetailsById(Integer card_id);
    void deleteCreditCardDetailsById(Integer card_id);
}
