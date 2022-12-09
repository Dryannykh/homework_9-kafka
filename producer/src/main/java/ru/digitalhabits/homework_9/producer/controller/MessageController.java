package ru.digitalhabits.homework_9.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.digitalhabits.homework_9.producer.domain.Message;
import ru.digitalhabits.homework_9.producer.service.MessageSender;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MessageController {

    private final MessageSender sender;

    @PutMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        sender.sendMessage(message.getMessage());
        return ResponseEntity.ok(message);
    }
}
