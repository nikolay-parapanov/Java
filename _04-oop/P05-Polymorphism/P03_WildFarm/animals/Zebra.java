package P03_WildFarm.animals;

import P03_WildFarm.foods.Food;
import P03_WildFarm.foods.Meat;

public class Zebra extends Mammal {


    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
