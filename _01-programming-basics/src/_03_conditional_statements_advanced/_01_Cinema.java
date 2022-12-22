package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pricePremiere = 12;
        double priceNormal = 7.5;
        double priceDiscount = 5;


        String typeProjection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        int total_tickets = rows * cols;
        double result = 0;

        switch (typeProjection) {
            case "Premiere": {
                result = total_tickets * pricePremiere;
            } break;
            case "Normal": {
                result = total_tickets * priceNormal;
            } break;
            case "Discount": {
                result = total_tickets * priceDiscount;
            } break;
        }
        System.out.printf("%.2f leva", result);
    }
}