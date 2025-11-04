package FullNotificationSystem;

import NotificationSystem.Notification;
import NotificationSystem.Sms;

public class SMSFactory implements NotificationFactory{

    @Override
    public Notification createNotification(String message) {
        return new Sms(message);
    }
}
