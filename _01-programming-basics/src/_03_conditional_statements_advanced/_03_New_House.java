package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _03_New_House {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String typeFlowers = sc.nextLine();
        int numberFlowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double pricePerUnit = 0;
        double discount = 0;
        switch (typeFlowers) {
            case "Roses":
                pricePerUnit = 5;
                if (numberFlowers > 80) {
                    discount = 0.1;
                }
                break;
            case "Dahlias":
                pricePerUnit = 3.8;
                if (numberFlowers > 90) {
                    discount = 0.15;
                }
                break;
            case "Tulips":
                pricePerUnit = 2.8;
                if (numberFlowers > 80) {
                    discount = 0.15;
                }
                break;
            case "Narcissus":
                pricePerUnit = 3;
                if (numberFlowers < 120) {
                    discount = -0.15;
                }
                break;
            case "Gladiolus":
                pricePerUnit = 2.5;
                if (numberFlowers < 80) {
                    discount = -0.20;
                }
                break;
        }

        double totalCost = pricePerUnit * numberFlowers * (1 - discount);
        double result = budget - totalCost;
        if (result >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, typeFlowers, result);
        } else System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(result));
    }
}
