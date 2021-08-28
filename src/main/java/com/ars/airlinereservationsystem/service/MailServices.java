package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Mail;
import java.util.List;


public interface MailServices {
    void saveMail(Mail mail);
    List<Mail> getAllMail();
    Mail getMailById(Integer mailId);
    void deleteMailById(Integer mailId);
}
