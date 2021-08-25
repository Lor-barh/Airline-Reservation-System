package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Admin;
import com.ars.airlinereservationsystem.models.Passenger;
import com.ars.airlinereservationsystem.repositories.AdminRepository;
import com.ars.airlinereservationsystem.service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminServicesImpl implements AdminServices {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminServicesImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin register(Admin admin) {
        return null;
    }

    @Override
    public String login(Admin admin, HttpSession session) {
        String redirect = "";
        if(admin != null){
            Admin currentAdmin = adminRepository.findAdminByEmailAndPassword
                    (admin.getEmail(), admin.getPassword());

            if (currentAdmin != null){
                session.setAttribute("passengerData", currentAdmin);
                redirect = "redirect:/passenger_dashboard";
            }else{
                redirect = "index";
            }
        }
        return redirect;
    }

    @Override
    public void logout(Admin admin, HttpSession session) {

    }

    @Override
    public Admin updateProfile(Admin admin) {
        return null;
    }
}
