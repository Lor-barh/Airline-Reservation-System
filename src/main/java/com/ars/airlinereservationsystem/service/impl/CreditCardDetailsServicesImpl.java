package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.CreditCardDetails;
import com.ars.airlinereservationsystem.repositories.CreditCardDetailsRpository;
import com.ars.airlinereservationsystem.service.CreditCardDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardDetailsServicesImpl implements CreditCardDetailsServices {

    @Autowired
    private CreditCardDetailsRpository creditCardDetailsRpository;

    @Override
    public void saveCreditCardDetails(CreditCardDetails creditCardDetails) {
        creditCardDetailsRpository.save(creditCardDetails);
    }

    @Override
    public List<CreditCardDetails> getAllCreditCardDetails() {
        return creditCardDetailsRpository.findAll();
    }

    @Override
    public CreditCardDetails getCreditCardDetailsById(Integer card_id) {
        return null;
    }

    @Override
    public void deleteCreditCardDetailsById(Integer card_id) {
        creditCardDetailsRpository.deleteById(card_id);
    }
}
