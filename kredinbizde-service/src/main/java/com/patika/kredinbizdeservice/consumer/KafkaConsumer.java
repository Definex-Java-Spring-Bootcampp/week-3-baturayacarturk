package com.patika.kredinbizdeservice.consumer;

import com.patika.kredinbizdeservice.interfaces.KafkaMessageRepository;
import com.patika.kredinbizdeservice.model.entity.KafkaErrorMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaConsumer {
    private final KafkaMessageRepository kafkaMessageRepository;

    public KafkaConsumer(KafkaMessageRepository kafkaMessageRepository) {
        this.kafkaMessageRepository = kafkaMessageRepository;
    }

    @KafkaListener(topics = "error-topic")
    public void listen(Object message) {
        System.out.println("Received message: " + message);
        KafkaErrorMessage errorMessage = new KafkaErrorMessage();
        errorMessage.setMessage(message.toString());
        errorMessage.setId(UUID.randomUUID().toString());
        kafkaMessageRepository.insert(errorMessage);

    }

}
