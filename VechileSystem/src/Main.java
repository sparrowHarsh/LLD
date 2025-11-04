import vechileSystem.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vechile ferrari = new SportsCar("Ferrai");
        Vechile jeep = new OffRoadCar("Jeep");
        Vechile tesla = new ElectricCar("Tesla");

        // Default behaviors
        System.out.println("=== Default Driving Behaviors ===");
        ferrari.drive();
        jeep.drive();
        tesla.drive();

        // Change behaviors at runtime
        System.out.println("\n=== After Changing Drive Behaviors ===");
        ferrari.setDrivingStrategy(new EcoDrive());
        ferrari.drive();

        jeep.setDrivingStrategy(new SportsDrive());
        jeep.drive();

        tesla.setDrivingStrategy(new NormalDrive());
        tesla.drive();
    }
}