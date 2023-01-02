package _01_basics_recap;

import java.util.Scanner;

public class _09_orders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(sc.nextLine());
        double totalPrice = 0;
        double pricePerCapsule = 0.0;
        int days = 0;
        int capsulesCount = 0;

        for (int orders = 1; orders <= countOfOrders; orders++) {
            pricePerCapsule = Double.parseDouble(sc.nextLine());
            days = Integer.parseInt(sc.nextLine());
            capsulesCount = Integer.parseInt(sc.nextLine());
            double currentPrice = pricePerCapsule * days * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f\n", currentPrice);
            totalPrice += currentPrice;
        }
        System.out.printf("Total: $%.2f\n", totalPrice);

    }
}
