package com.patika.kredinbizdeservice.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class KafkaErrorMessage {
    @Id
    private String id;
    private String message;
}
