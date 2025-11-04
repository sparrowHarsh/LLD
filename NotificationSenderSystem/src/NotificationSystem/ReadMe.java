package NotificationSystem;

public class ReadMe {
    /*
    This design pattern also have a case base abstraction, that is whenever we will add one new type of object in notificatin
    we have to modify the Notification factory class and add a case statement out there.

    NotificationFactory centralizes creation logic, but it still uses a switch (or if-else).
    It solves code scattering — main() no longer knows about individual classes.
    But yes, it still needs modification each time a new type is added.

    This pattern is called a Simple Factory or Static Factory, not the full Factory Method pattern.
     */
}
