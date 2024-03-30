package com.patika.kredinbizdeservice.interfaces;

import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.producer.dto.NotificationDTO;
import com.patika.kredinbizdeservice.producer.enums.NotificationType;

public interface NotificationStrategy {
    NotificationDTO sendNotification(User user);
    NotificationType notificationType();


}
