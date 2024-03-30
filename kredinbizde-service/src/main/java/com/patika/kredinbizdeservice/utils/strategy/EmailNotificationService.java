package com.patika.kredinbizdeservice.utils.strategy;

import com.patika.kredinbizdeservice.interfaces.NotificationStrategy;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.producer.dto.NotificationDTO;
import com.patika.kredinbizdeservice.producer.enums.NotificationType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class EmailNotificationService implements NotificationStrategy {

    @Override
    public NotificationDTO sendNotification(User user) {
        return NotificationDTO.builder()
                .message("user kaydedildi.")
                .notificationType(notificationType())
                .email(user.getEmail())
                .build();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

}
