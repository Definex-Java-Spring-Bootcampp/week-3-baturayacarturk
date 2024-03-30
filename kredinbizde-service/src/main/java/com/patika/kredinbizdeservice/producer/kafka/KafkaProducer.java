package com.patika.kredinbizdeservice.producer.kafka;

import com.patika.kredinbizdeservice.configuration.TopicConfigurationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class KafkaProducer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private TopicConfigurationReader topicConfigurationReader;

    public void sendMessage(String topicName, Object message) {

        List<String> topics = topicConfigurationReader.getTopics();
        if (topics.contains(topicName)) {
            kafkaTemplate.send(topicName, message);
            logger.info("Message sent to topic '{}': {}", topicName, message);
        } else {
            logger.error("Topic '{}' not found in the configuration.", topicName);
        }



    }

}
