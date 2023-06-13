package P02_Vehicles_Extension;

public class Bus extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.4;

    protected Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    public String driveWithPassengers(double distance) {
        super.addConsumption(AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
        String out = super.drive(distance);
        super.subtractConsumption(AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
        return out;
    }
}
