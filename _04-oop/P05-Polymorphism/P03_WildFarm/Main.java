package P03_WildFarm;

import P03_WildFarm.animals.*;
import P03_WildFarm.foods.Food;
import P03_WildFarm.foods.Meat;
import P03_WildFarm.foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String evenLine = scanner.nextLine();
        List<Animal> animalList = new ArrayList<>();

        while (!evenLine.equals("End")){
            Animal animal= createAnimal(evenLine.split("\\s+"));

            String oddLine = scanner.nextLine() ;

            Food food = createFood(oddLine.split("\\s+"));
            animal.makeSound();
            try{
                animal.eat(food);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            animalList.add(animal);

            evenLine= scanner.nextLine();
        }
    }

    private static Food createFood(String[] tokens) {
        int quantity = Integer.parseInt(tokens[1]);
        return tokens[0].equals("Meat")
                ? new Meat(quantity)
                : new Vegetable(quantity);
    }

    private static Animal createAnimal(String[] tokens) {
        switch (tokens[0]){
            case "Cat":
                return new Cat(tokens[1], "Cat", Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
            case "Tiger":
                return new Tiger(tokens[1], "Tiger", Double.parseDouble(tokens[2]), tokens[3]);
            case "Zebra":
                return new Zebra(tokens[1], "Zebra", Double.parseDouble(tokens[2]), tokens[3]);
            case "Mouse":
                return new Mouse(tokens[1], "Mouse", Double.parseDouble(tokens[2]), tokens[3]);
            default:
                throw new IllegalArgumentException("Unknown animal type"+ tokens[0]);
        }
    }
}
