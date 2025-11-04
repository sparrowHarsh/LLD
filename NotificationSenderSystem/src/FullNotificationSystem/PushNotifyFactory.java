package FullNotificationSystem;

import NotificationSystem.Notification;
import NotificationSystem.PushNotify;

public class PushNotifyFactory implements NotificationFactory {
    @Override
    public Notification createNotification(String message) {
        return new PushNotify(message);
    }
}
