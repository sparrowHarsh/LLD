import FullNotificationSystem.EmailFactory;
import FullNotificationSystem.PushNotifyFactory;
import FullNotificationSystem.SMSFactory;
import NotificationSystem.Notification;
import FullNotificationSystem.NotificationFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        -> THis is the half Factory Design
        Notification push = NotificationFactory.createNotification("push", "Hello World!");
        System.out.println(push.sendNotification());

        Notification sms = NotificationFactory.createNotification("sms", "This is from SMS");
        System.out.println(sms.sendNotification());

        Notification email = NotificationFactory.createNotification("email", "This is from Email");
        System.out.println(email.sendNotification());

        Notification wapp = NotificationFactory.createNotification("WhatsApp", "This is from Email");
        System.out.println(wapp.sendNotification());

         */

        NotificationFactory sms = new SMSFactory();
        Notification notification = sms.createNotification("Hello from SMS!");
        System.out.println(notification.sendNotification());

        NotificationFactory email = new EmailFactory();
        Notification emailNotification = email.createNotification("Hello from Email!");
        System.out.println(emailNotification.sendNotification());

        NotificationFactory pushNotify = new PushNotifyFactory();
        Notification pushNotification = pushNotify.createNotification("Hello from PushNotify!");
        System.out.println(pushNotification.sendNotification());
    }
}

