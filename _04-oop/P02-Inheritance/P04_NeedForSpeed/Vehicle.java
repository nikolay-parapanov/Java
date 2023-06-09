package P04_NeedForSpeed;

public class Vehicle {
//• DEFAULT_FUEL_CONSUMPTION – final static double (constant)
//• fuelConsumption – double
//• fuel – double
//• horsePower – int

    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private  int horsePower;

    public Vehicle (double fuel, int horsePower){
        this.setFuel(fuel);
        this.setHorsePower(horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }


    public void drive(double kilometers){
        if (this.fuel >= kilometers * this.fuelConsumption){
            this.fuel = fuel - kilometers * this.fuelConsumption;
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
