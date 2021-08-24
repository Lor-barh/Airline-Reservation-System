package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.models.Person;
import com.ars.airlinereservationsystem.repositories.PassengerRepository;
import com.ars.airlinereservationsystem.repositories.PersonRepository;
import com.ars.airlinereservationsystem.service.PassengerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServicesImpl implements PassengerServices {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Person save(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}
