package P01_PriceCalculator;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 50.25 5 Summer VIP

        String inputSeason = "Summer";
        Season season = Season.valueOf(inputSeason.toUpperCase());

        PriceCalculator priceCalculator = new PriceCalculator(season, Discount.VIP, 50.25, 5);

        System.out.println(priceCalculator.calculatePrice());
    }
}
