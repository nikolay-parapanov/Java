package _01_first_steps_in_programming;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double sand_etc_percentage = Double.parseDouble(sc.nextLine());

        double total_water_before_sand = length * width * height;
        double total_water_after_sand = total_water_before_sand * (1 - sand_etc_percentage/100)/1000;

        System.out.println(total_water_after_sand);
    }

}

