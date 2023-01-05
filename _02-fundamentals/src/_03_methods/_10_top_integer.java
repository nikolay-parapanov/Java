package _03_methods;

import java.util.Scanner;

public class _10_top_integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 0; number < n; number++) {
            if (isSumDivisibleByEight(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumDivisibleByEight(int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        return sumDigits % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number) {
        boolean flag = false;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                flag = true;
                break;
            }
            number = number / 10;
        }
        return flag;
    }
}
