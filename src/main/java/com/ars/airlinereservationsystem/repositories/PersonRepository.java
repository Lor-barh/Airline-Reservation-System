package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByEmailAndPassword(String email, String password);
}