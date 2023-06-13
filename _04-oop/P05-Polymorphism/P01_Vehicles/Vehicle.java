package P01_Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuel;
    private double consumption;
    private double tankCapacity;

    protected Vehicle(double fuel, double consumption, double tankCapacity) {
        this.setFuel(fuel);
        this.consumption = consumption;
        this.tankCapacity = tankCapacity;

    }

    private void setFuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuel = fuel;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if (fuelNeeded > this.fuel) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.setFuel(this.fuel - fuelNeeded);

        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), formatter.format(distance));
    }

    public void refuel(double liters) {
        this.setFuel(this.fuel + liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
