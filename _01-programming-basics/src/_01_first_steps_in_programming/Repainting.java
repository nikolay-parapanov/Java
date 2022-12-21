package _01_first_steps_in_programming;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price_per_protection_cover = 1.5;
        double price_per_liter_paint = 14.5;
        double price_per_liter_paint_dilator = 5;

        double cover_needed = Double.parseDouble(sc.nextLine());
        double paint_needed = Double.parseDouble(sc.nextLine());
        double dilator_needed = Double.parseDouble(sc.nextLine());
        int hours_of_work = Integer.parseInt(sc.nextLine());

        double result_materials = ((cover_needed + 2) * price_per_protection_cover) + (paint_needed * 1.1 * price_per_liter_paint) + (dilator_needed * price_per_liter_paint_dilator)+ 0.4;
        double total_materials = result_materials + result_materials * 0.3 * hours_of_work ;

        System.out.println(total_materials);

    }
}

