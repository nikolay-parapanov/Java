package P02_Vehicles_Extension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();
        vehiclesMap.put("Car", createVehicle(scanner.nextLine().split("\\s+")));
        vehiclesMap.put("Truck", createVehicle(scanner.nextLine().split("\\s+")));

        Bus bus = createBus(scanner.nextLine().split("\\s+"));
        vehiclesMap.put("Bus", bus);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        while (commandsCount-- > 0) {
            String command = scanner.nextLine();
            String[] params = command.split("\\s+");
            double argument = Double.parseDouble(params[2]);

            if (command.contains("Drive") && command.contains("Bus")) {
                System.out.println(bus.driveWithPassengers(argument));
            } else if (command.contains("Drive")) {
                System.out.println(vehiclesMap.get(params[1]).drive(argument));
            } else {
                try {
                    vehiclesMap.get(params[1]).refuel(argument);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
        for (Vehicle vehicle : vehiclesMap.values()) {
            System.out.println(vehicle.toString());
        }
    }

    private static Bus createBus(String[] tokens) {
        return new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
    }

    private static Vehicle createVehicle(String[] tokens) {
        switch (tokens[0]) {
            case "Car":
                return new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
            case "Truck":
                return new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
            case "Bus":
                return createBus(tokens);
            default:
                throw new IllegalArgumentException("Unknown Vehicle type for " + tokens[0]);
        }
    }
}
