package FullNotificationSystem;

import NotificationSystem.Email;
import NotificationSystem.Notification;

public class EmailFactory implements NotificationFactory{

    @Override
    public Notification createNotification(String message) {
        return new Email(message);
    }
}
