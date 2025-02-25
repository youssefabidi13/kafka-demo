package com.abidiyoussef.kafka.consumer;

import com.abidiyoussef.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
    //@KafkaListener(topics = "abidi", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from abidi Topic:: %s", msg));
    }

    @KafkaListener(topics = "abidi", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from abidi Topic:: %s", student.toString()));
    }
}