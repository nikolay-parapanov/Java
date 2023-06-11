package P04_PizzaCalories;

import java.util.Map;

public class Topping {

    private static final Map<String, Double> TOPPING_TYPES_WITH_MODIFIERS = Map.of(
            "Meat", 1.2,
            "Veggies", 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9);

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (!TOPPING_TYPES_WITH_MODIFIERS.containsKey(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        if (weight > 50 || weight < 1) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        return weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * TOPPING_TYPES_WITH_MODIFIERS.get(this.toppingType);
    }
}
