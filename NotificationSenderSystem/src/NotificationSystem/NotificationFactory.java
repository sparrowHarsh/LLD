package NotificationSystem;

public class NotificationFactory {

    // This function will return object of Notification
    public static Notification createNotification(String type, String message){
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Notification type cannot be null or empty");
        }

        switch (type.toLowerCase()) {
            case "push":
                return new PushNotify(message);
            case "sms":
                return new Sms(message);
            case "email":
                return new Email(message);
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
