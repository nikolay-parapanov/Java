package _02_if_statements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double record_seconds = Double.parseDouble(sc.nextLine());
        double meters = Double.parseDouble(sc.nextLine());
        double ivan_seconds = Double.parseDouble(sc.nextLine());

        double total_seconds_ivan = meters * ivan_seconds;
        double times_additional_seconds = Math.floor(meters / 15);
        double additional_seconds = times_additional_seconds * 12.5;

        double total_time = total_seconds_ivan + additional_seconds;

        double result = record_seconds - total_time;

        if (result > 0) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total_time);
        } else System.out.printf("No, he failed! He was %.2f seconds slower.", (total_time - record_seconds));
    }
}
