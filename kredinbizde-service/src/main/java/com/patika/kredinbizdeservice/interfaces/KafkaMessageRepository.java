package com.patika.kredinbizdeservice.interfaces;

import com.patika.kredinbizdeservice.model.entity.KafkaErrorMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaMessageRepository extends MongoRepository<KafkaErrorMessage, String> {
    public KafkaErrorMessage insert(KafkaErrorMessage kafkaErrorMessage);
}
