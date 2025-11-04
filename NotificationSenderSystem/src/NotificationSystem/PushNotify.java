package NotificationSystem;

import java.security.PrivateKey;

public class PushNotify implements Notification {
    private String message;

    public PushNotify(String message) {
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return ("Push Notification: " + message);
    }
}
