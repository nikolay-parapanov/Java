package _03_methods;

import java.util.Scanner;

public class _08_factorial_division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());

        long fact1 = calculatedFactorial(number1);
        long fact2 = calculatedFactorial(number2);

        double result = fact1*1.0 / fact2;
        System.out.printf("%.2f",result);
    }

    private static long calculatedFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
