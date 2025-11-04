package vechileSystem;

public class Vechile {
    String name;
    String type;
    String driveMode;   // This will tell which drive mode it is, but what if here some algos are getting used
    DrivingStrategy drivingStrategy;


    public Vechile(DrivingStrategy drivingStrategy,  String name, String type) {
        this.drivingStrategy = drivingStrategy;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void drive(){
        System.out.println(name + "( " + type + " ): ");
        drivingStrategy.drive();
    }

    // changing drive type at the run time
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
}
