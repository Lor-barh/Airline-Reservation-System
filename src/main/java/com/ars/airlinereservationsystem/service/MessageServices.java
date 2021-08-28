package com.ars.airlinereservationsystem.service;
import com.ars.airlinereservationsystem.models.Message;
import java.util.List;

public interface MessageServices {
    void saveMessage(Message message);
    List<Message> getAllMessage();
    Message getMessageById(Integer MessageId);
    void deleteMessageById(Integer MessageId);
}
