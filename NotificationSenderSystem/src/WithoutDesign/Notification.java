package WithoutDesign;

/*
    In this code we are dependent upon calsses such as PushNotify, SMS, Email to crate object now if we want to add new notification
    type, we have to modify main class and it violets open/closed principle

    The object creation logic is scattered across codebase instead of being centralised
 */

public class Notification {
    String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
