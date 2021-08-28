package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Mail;
import com.ars.airlinereservationsystem.repositories.MailRepository;
import com.ars.airlinereservationsystem.service.MailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServicesImpl implements MailServices {

    @Autowired
    private MailRepository mailRepository;

    @Override
    public void saveMail(Mail mail) {
        mailRepository.save(mail);
    }

    @Override
    public List<Mail> getAllMail() {
        return mailRepository.findAll();
    }

    @Override
    public Mail getMailById(Integer mailId) {
        return null;
    }

    @Override
    public void deleteMailById(Integer mailId) {
        mailRepository.deleteById(mailId);
    }
}
