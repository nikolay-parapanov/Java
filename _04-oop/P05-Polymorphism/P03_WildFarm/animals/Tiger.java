package P03_WildFarm.animals;

import P03_WildFarm.foods.Food;
import P03_WildFarm.foods.Vegetable;

public class Tiger extends Felime{
    public Tiger(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }
}
