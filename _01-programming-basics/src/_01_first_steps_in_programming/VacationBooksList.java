package _01_first_steps_in_programming;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total_pages = Integer.parseInt(sc.nextLine());
        int pages_per_hour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int hours_needed = total_pages/ pages_per_hour;
        int hours_per_day = hours_needed/days;

        System.out.println(hours_per_day);
        }
    }

