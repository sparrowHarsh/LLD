package vechileSystem;

public class SportsCar extends Vechile {
    public  SportsCar(String name) {
        super(new SportsDrive(), name, "Sports car");
    }
}
