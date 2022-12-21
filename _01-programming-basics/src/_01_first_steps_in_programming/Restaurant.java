package _01_first_steps_in_programming;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chicken_menus = Integer.parseInt(sc.nextLine());
        int fish_menus = Integer.parseInt(sc.nextLine());
        int vegetarian_menus = Integer.parseInt(sc.nextLine());

        double price_chicken_menu = 10.35;
        double price_fish_menu = 12.4;
        double price_vegetarian_menu = 8.15;
        double price_delivery = 2.5;

        double price_before_discount = (chicken_menus * price_chicken_menu + fish_menus * price_fish_menu + vegetarian_menus * price_vegetarian_menu);
        double price_dessert = price_before_discount * 0.2;

        double total_price = price_before_discount + price_dessert + price_delivery;

        System.out.println(total_price);

    }
}
