package ru.digitalhabits.homework_9.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @KafkaListener(topics = "topic2")
    public void listener(String message) {
        System.out.println("Second consumer received message : " + message);
    }
}
