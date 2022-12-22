package _02_if_statements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double puzzle_price = 2.6;
        double doll_price = 3;
        double bear_price = 4.1;
        double minion_price = 8.2;
        double truck_price = 2;

        double holiday_price = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        int counter = 0;
        double discount = 0;

        double gross_profit = puzzles * puzzle_price + dolls * doll_price + bears * bear_price + minions * minion_price + trucks * truck_price;
        counter += puzzles + dolls + bears + minions + trucks;

        if (counter >= 50) {
            discount = 0.25;
        }

        double net_profit = gross_profit * (1 - discount);
        double rent = net_profit * 0.1;
        double money_left = net_profit - rent;
        if (money_left >= holiday_price) {
            System.out.printf("Yes! %.2f lv left.", (money_left - holiday_price));
        } else System.out.printf("Not enough money! %.2f lv needed.", (holiday_price-money_left));

    }
}
