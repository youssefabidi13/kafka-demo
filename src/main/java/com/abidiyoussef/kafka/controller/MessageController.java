package com.abidiyoussef.kafka.controller;

import com.abidiyoussef.kafka.payload.Student;
import com.abidiyoussef.kafka.produce.KafkaJsonProducer;
import com.abidiyoussef.kafka.produce.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;
    public MessageController(KafkaProducer kafkaProducer, KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaProducer = kafkaProducer;
        this.kafkaJsonProducer = kafkaJsonProducer;
    }


    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody String message
    ) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(
            @RequestBody Student message
    ) {
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }
}
