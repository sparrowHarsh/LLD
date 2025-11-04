package NotificationSystem;

public class Email implements Notification {
    String message;
    public Email(String message) {
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return ("Email: " + message);
    }
}
