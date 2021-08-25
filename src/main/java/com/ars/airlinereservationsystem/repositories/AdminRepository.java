package com.ars.airlinereservationsystem.repositories;

import com.ars.airlinereservationsystem.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findAdminByEmailAndPassword(String email, String password);
}
