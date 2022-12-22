package _02_if_statements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int minutesMovie = Integer.parseInt(sc.nextLine());
        double minutesBreak = Double.parseDouble(sc.nextLine());

        double lunchTime = minutesBreak / 8;
        double restTime = minutesBreak / 4;

        double remainingMinutesOfBreak = minutesBreak - lunchTime - restTime;
        double result = remainingMinutesOfBreak - minutesMovie;

        if (result >= 0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(Math.abs(result)) );
        }else System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(Math.abs(result)) );


    }
}
