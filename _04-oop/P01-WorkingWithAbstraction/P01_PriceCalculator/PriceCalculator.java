package P01_PriceCalculator;

import javax.swing.*;

public class PriceCalculator {
    private Season season;
    private Discount discount;
    private double pricePerDay;
    private int days;

    public PriceCalculator(Season season, Discount discount, double pricePerDay, int days) {
        this.season = season;
        this.discount = discount;
        this.pricePerDay = pricePerDay;
        this.days = days;
    }

    public double calculatePrice() {
        return this.days * this.pricePerDay * season.getMultiplier()
                *(1.00-(this.discount.getDiscount()/100.00));
    }
}
