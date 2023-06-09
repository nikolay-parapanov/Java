package P03_ShoppingSpree;

public class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public void setName(String name) {
        if (!StringValidator.isValidName(name)) {
            throw new IllegalArgumentException(ConstantMessages.INVALID_NAME_EXCEPTION_MESSAGE);
        }
        this.name = name;
    }

    public void setCost(Double cost) {
        if (!NumericValidator.isNonNegative(cost)){
            throw new IllegalArgumentException(ConstantMessages.NEGATIVE_MONEY_EXCEPTION_MESSAGE);
        }
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }
}
