package com.patika.kredinbizdeservice.configuration;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class TopicConfigurationReader {
    private static final Logger logger = LoggerFactory.getLogger(TopicConfigurationReader.class);
    private List<String> topics;

    @PostConstruct
    public void initialize() {
        topics = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new ClassPathResource("kafka-topics.txt").getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                logger.info("Topic read {}",line.trim());
                topics.add(line.trim());
            }
        } catch (IOException e) {
            logger.error("Error reading topics from file", e);
        }
    }

    public List<String> getTopics() {
        return topics;
    }
}
