package P02_Vehicles_Extension;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 0.9;


    public Car(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }
}
