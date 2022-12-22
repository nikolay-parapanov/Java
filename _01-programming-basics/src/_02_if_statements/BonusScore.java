package _02_if_statements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int user_input = Integer.parseInt(sc.nextLine());
        double bonus = 0;

        if (user_input <= 100) {
            bonus = 5;
        } else if (user_input <= 1000) {
            bonus = user_input * 0.2;
        } else {
            bonus = user_input * 0.1;
        }

        if (user_input % 2 == 0) {
            bonus = bonus + 1;
        }

        if (user_input % 10 == 5) {
            bonus = bonus + 2;
        }
        double result = user_input + bonus;
        System.out.println(bonus);
        System.out.println(result);
    }
}
