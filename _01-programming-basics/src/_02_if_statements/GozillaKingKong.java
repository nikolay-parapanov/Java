package _02_if_statements;

import java.util.Scanner;

public class GozillaKingKong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int persons = Integer.parseInt(sc.nextLine());
        double price_per_person = Double.parseDouble(sc.nextLine());

        double decor = budget * 0.1;
        if (persons > 150) {
            price_per_person = price_per_person * 0.9;
        }

        double total_cost = decor + persons * price_per_person;
        double money_left = budget - total_cost;

        if (money_left >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", money_left);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", -money_left);
        }
    }
}

