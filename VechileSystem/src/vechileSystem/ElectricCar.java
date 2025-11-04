package vechileSystem;

public class ElectricCar extends Vechile{
    public  ElectricCar(String name) {
        super(new EcoDrive(), name, "Electrical car");
    }
}
