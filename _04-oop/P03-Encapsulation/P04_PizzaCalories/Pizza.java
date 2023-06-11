package P04_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppingsCount(numberOfToppings);
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.trim().length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppingsCount(int numberOfToppings){
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double calories = this.dough.calculateCalories();
        for (Topping topping : toppings) {
            calories+= topping.calculateCalories();
        }
        return calories;
    }

    @Override
    public String toString() {
        return String.format(" %s - %.2f", this.name, this.getOverallCalories()) ;
    }
}
