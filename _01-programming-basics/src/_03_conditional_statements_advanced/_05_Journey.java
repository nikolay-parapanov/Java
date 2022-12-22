package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String accomodation = "";
        String destination = "";
        double costPercentage = 0;

        switch (season) {
            case "Summer":
                accomodation = "Camp";
                break;
            case "Winter":
                accomodation = "Hotel";
                break;
        }

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    accomodation = "Camp";
                    costPercentage = 0.3;
                    break;
                case "winter":
                    accomodation = "Hotel";
                    costPercentage = 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    accomodation = "Camp";
                    costPercentage = 0.4;
                    break;
                case "winter":
                    accomodation = "Hotel";
                    costPercentage = 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            accomodation = "Hotel";
            costPercentage = 0.9;
        }

        double totalCost = budget * costPercentage;

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, totalCost);

    }
}

