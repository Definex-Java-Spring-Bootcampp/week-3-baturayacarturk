package com.patika.kredinbizdeservice.exceptions.serializer;

import com.patika.kredinbizdeservice.exceptions.KredinbizdeException;
import org.apache.kafka.common.serialization.Serializer;

import java.nio.charset.StandardCharsets;

public class KredinBizdeExceptionSerializer implements Serializer<KredinbizdeException> {
    @Override
    public byte[] serialize(String topic, KredinbizdeException data) {
        // Implement serialization logic here
        return data.toString().getBytes(StandardCharsets.UTF_8);
    }
}
