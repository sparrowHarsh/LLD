package strategy;
/*
public class Car extends Vechile {

    public Car(String vechileName, int vechileType,int vechileNumber){
        super(vechileName,vechileType,vechileNumber);
    }

    @Override
    public int maxDriveSpeed() {
        // car can have maximum spped upto 100
        return 100;
    }

    @Override
    public void display() {
        System.out.println("THis is car");
    }
}
*/

/*
This is not strategy pattern, Now if we want to have different type of cars such as super car, electric car and all, then we have update maxSpeed of all the cars
SO there will be a lot of subclasses -> This is class explosion (typical sign we need a Strategy Pattern)

Now here If we want to create different type of cars, having differnet speed then we have to create a lot of subclasses
 */
