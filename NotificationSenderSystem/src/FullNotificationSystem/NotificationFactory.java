package FullNotificationSystem;

import NotificationSystem.Notification;

public interface NotificationFactory {
    Notification createNotification(String message);
}
