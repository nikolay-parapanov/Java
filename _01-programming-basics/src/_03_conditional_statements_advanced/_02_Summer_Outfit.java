package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _02_Summer_Outfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int degrees = Integer.parseInt(sc.nextLine());
        String timeOfDay = sc.nextLine();


        String sweatShirt = "Sweatshirt";
        String shirt = "Shirt";
        String tShirt = "T-Shirt";
        String swimSuit = "Swim Suit";

        String sneakers = "Sneakers";
        String moccasins = "Moccasins";
        String sandals = "Sandals";
        String barefoot = "Barefoot";

        String temp = "";
        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            temp = "cold";
        } else if (degrees > 18 && degrees <= 24) {
            temp = "normal";
        } else if (degrees > 24) {
            temp = "hot";
        }

        switch (temp) {
            case "cold":
                switch (timeOfDay) {
                    case "Morning":
                        outfit = sweatShirt;
                        shoes = sneakers;
                        break;
                    case "Afternoon":
                        outfit = shirt;
                        shoes = moccasins;
                        break;
                    case "Evening":
                        outfit = shirt;
                        shoes = moccasins;
                        break;
                }
                break;

            case "normal":
                switch (timeOfDay) {
                    case "Morning":
                        outfit = shirt;
                        shoes = moccasins;
                        break;
                    case "Afternoon":
                        outfit = tShirt;
                        shoes = sandals;
                        break;
                    case "Evening":
                        outfit = shirt;
                        shoes = moccasins;
                        break;
                }
                break;

            case "hot":
                switch (timeOfDay) {
                    case "Morning":
                        outfit = tShirt;
                        shoes = sandals;
                        break;
                    case "Afternoon":
                        outfit = swimSuit;
                        shoes = barefoot;
                        break;
                    case "Evening":
                        outfit = shirt;
                        shoes = moccasins;
                        break;
                }
                break;

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
