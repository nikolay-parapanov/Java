package P04_PizzaCalories;

import java.util.Map;

public class Dough {

    private static final Map<String, Double> FLOUR_TYPES_WITH_MODIFIERS = Map.of(
            "White", 1.5,
            "Wholegrain", 1.0);
    private static final Map<String, Double> BAKING_TECHNIQUES_WITH_MODIFIERS = Map.of(
            "Crispy", .9,
            "Chewy", 1.1,
            "Homemade", 1.0);

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }


    private void setFlourType(String flourType) {
        if (!FLOUR_TYPES_WITH_MODIFIERS.containsKey(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!BAKING_TECHNIQUES_WITH_MODIFIERS.containsKey(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight<1 || weight> 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return this.weight * 2 *
                FLOUR_TYPES_WITH_MODIFIERS.get(flourType)*
                BAKING_TECHNIQUES_WITH_MODIFIERS.get(bakingTechnique);
    }
}
