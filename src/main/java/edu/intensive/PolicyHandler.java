package edu.intensive;

import edu.intensive.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @Autowired
    StudentRepository studentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onEvent(@Payload String message) {
    }
}
