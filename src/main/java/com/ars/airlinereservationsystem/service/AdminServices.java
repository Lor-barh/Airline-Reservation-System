package com.ars.airlinereservationsystem.service;

import com.ars.airlinereservationsystem.models.Admin;
import com.ars.airlinereservationsystem.models.Passenger;

import javax.servlet.http.HttpSession;

public interface AdminServices {
    Admin register(Admin admin);
    String login(Admin admin, HttpSession session);
    void logout(Admin admin,HttpSession session);
    Admin updateProfile(Admin admin);

}
