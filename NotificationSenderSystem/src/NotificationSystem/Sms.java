package NotificationSystem;

public class Sms implements Notification{
    private  String message;

    public Sms(String message) {
        this.message = message;
    }

    @Override
    public String sendNotification() {
        return ("SMS: " + message);
    }
}

/*
    Here we can do thsi as well, But one class should have only one thing to do, And this has the work of creation
    we can't add business logic inside the same class so for this we need to make a different class name SMSFactory

    public class SMS implements NotificationFactory, Notification {
    private String message;

    public SMS(String message) {
        this.message = message;
    }

    @Override
    public Notification createNotification(String message) {
        return new SMS(message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS: " + message);
    }
}
 */
