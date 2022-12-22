package _02_if_statements;

import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        if (minutes > 44) {
            hours += 1;
            minutes += 15 - 60;
            if (hours >= 24) {
                hours = hours - 24;
            }
        } else minutes += 15;

        System.out.printf("%d:%02d", hours, minutes);
    }
}
