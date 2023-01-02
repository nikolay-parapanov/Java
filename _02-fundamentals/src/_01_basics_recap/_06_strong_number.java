package _01_basics_recap;

import java.util.Scanner;

public class _06_strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int inputAsInt = Integer.parseInt(input);

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum += fact;
        }
        if (sum == inputAsInt) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}
