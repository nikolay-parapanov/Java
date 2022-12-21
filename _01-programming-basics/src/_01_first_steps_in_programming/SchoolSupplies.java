package _01_first_steps_in_programming;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price_per_batch_pens = 5.8;
        double price_per_batch_markers = 7.2;
        double detergent_liter = 1.2;

        int number_batch_pens = Integer.parseInt(sc.nextLine());
        int number_batch_markers = Integer.parseInt(sc.nextLine());
        int liters_detergent = Integer.parseInt(sc.nextLine());
        double discount = Double.parseDouble(sc.nextLine());

        double total_amt_needed= (number_batch_pens * price_per_batch_pens + number_batch_markers * price_per_batch_markers + liters_detergent * detergent_liter)* 0.75;
        System.out.println(total_amt_needed);

    }

}

