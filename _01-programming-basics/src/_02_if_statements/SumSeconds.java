package _02_if_statements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first_competitor_seconds = Integer.parseInt(sc.nextLine());
        int second_competitor_seconds = Integer.parseInt(sc.nextLine());
        int third_competitor_seconds = Integer.parseInt(sc.nextLine());

        int total_seconds = first_competitor_seconds + second_competitor_seconds + third_competitor_seconds;

        int minutes = total_seconds / 60;
        int seconds_left = total_seconds % 60;

        System.out.printf("%d:%02d", minutes, seconds_left);
    }
}

