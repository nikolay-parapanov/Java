package P03_WildFarm.animals;

import P03_WildFarm.foods.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String name;
    private String type;
    private double weight;
    private int foodEaten;
    private String livingRegion;

    public Animal(String name, String type, double weight, String livingRegion) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.livingRegion = livingRegion;
    }

    protected String getType(){
        return this.type;
    }
    public abstract void makeSound();

    public void eat(Food food){
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("##.##");
        return String.format("%s[%s ,%s ,%s ,%d ", this.getType(), this.name, formater.format(this.weight),this.livingRegion , this.foodEaten);
    }
}
