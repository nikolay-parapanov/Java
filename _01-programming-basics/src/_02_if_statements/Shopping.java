package _02_if_statements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double videocard_price = 250;

        double budget = Double.parseDouble(sc.nextLine());
        int videocards_number = Integer.parseInt(sc.nextLine());
        int processors_number = Integer.parseInt(sc.nextLine());
        int ram_number = Integer.parseInt(sc.nextLine());

        double discount = 0;

        if (videocards_number > processors_number) {
            discount = 0.15;
        }

        double videocards_total_cost = videocard_price * videocards_number;
        double processor_price = videocards_total_cost * 0.35;
        double ram_price = videocards_total_cost * 0.1;

        double final_cost = (videocards_total_cost + processor_price*processors_number + ram_price*ram_number) * (1-discount);

        double result = budget - final_cost;

        if (result >= 0) {
            System.out.printf("You have %.2f leva left!", result);
        } else System.out.printf("Not enough money! You need %.2f leva more!", -result);


    }

}

