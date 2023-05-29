package P05Classes.E05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new HashMap<>();

        while (n-->0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);

            Engine engine;

            if (tokens.length ==2){
                engine = new Engine(model, power);
            } else if (tokens.length == 4){
                engine = new Engine(model, power,Integer.parseInt(tokens[2]), tokens[3]);
            } else {
                try {
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException ex){
                    engine = new Engine(model, power, tokens[2]);
                }
            }
            engineMap.put(model, engine);
        }
        n = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();
        while(n-->0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            String engineModel = tokens[1];

            Car car;
            if (tokens.length ==2){
                car = new Car(model, engineMap.get(engineModel));
            } else if (tokens.length == 4){
                car = new Car(model, engineMap.get(engineModel), Integer.parseInt(tokens[2]), tokens[3]);
            } else {
                try {
                    int weight = Integer.parseInt(tokens[2]);
                    car = new Car(model, engineMap.get(engineModel), weight);
                } catch (NumberFormatException ex){
                    car = new Car(model, engineMap.get(engineModel), tokens[2]);
                }
            }
            carList.add(car);
        }
        carList.forEach(System.out::println);

    }
}
