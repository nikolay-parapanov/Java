package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _04_Fishing_Boat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherMen = Integer.parseInt(sc.nextLine());

        double boatRent = 0;
        double countDiscount = 0;
        double additionalDiscount = 0;

        switch (season) {
            case "Spring":
                boatRent = 3000;
                break;
            case "Summer":
                boatRent = 4200;
                break;
            case "Autumn":
                boatRent = 4200;
                break;
            case "Winter":
                boatRent = 2600;
                break;
        }

        if (fisherMen <= 6) {
            countDiscount = 0.1;
        } else if (fisherMen<= 11){
            countDiscount = 0.15;
        } else countDiscount = 0.25;

        if (fisherMen % 2 == 0 && !"Autumn".equals(season)){
            additionalDiscount = 0.05;
        }

        double totalCost = boatRent *(1-countDiscount)*(1-additionalDiscount);

        double result = budget - totalCost;

        if (result >= 0){
            System.out.printf("Yes! You have %.2f leva left.", result);
        } else System.out.printf("Not enough money! You need %.2f leva.", Math.abs(result));
    }
}
