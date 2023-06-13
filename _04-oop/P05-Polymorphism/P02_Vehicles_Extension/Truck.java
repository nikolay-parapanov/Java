package P02_Vehicles_Extension;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.6;

    protected Truck(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption +AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters*.95);
    }
}
