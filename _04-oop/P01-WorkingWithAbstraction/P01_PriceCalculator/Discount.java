package P01_PriceCalculator;

public enum Discount {
    VIP(20),
    SECOND_VISIT(10),
    NONE(0);

    private final int discount;

    Discount (int discout){
        this.discount = discout;
    }

    public int getDiscount(){
        return this.discount;
    }
}
