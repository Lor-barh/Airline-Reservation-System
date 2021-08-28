package com.ars.airlinereservationsystem.service.impl;

import com.ars.airlinereservationsystem.models.Message;
import com.ars.airlinereservationsystem.repositories.MessageRepository;
import com.ars.airlinereservationsystem.service.MessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServicesImpl implements MessageServices {

   @Autowired
   private MessageRepository messageRepository;

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessage() {
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(Integer MessageId) {
        return null;
    }

    @Override
    public void deleteMessageById(Integer messageId) {
        messageRepository.deleteById(messageId);
    }
}
