package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _06_Operations_Between_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        char symbol = sc.nextLine().charAt(0);

        double result = 0;
        String resultType = "";

        switch (symbol) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = (double) firstNumber / secondNumber;
                    break;
                }
            case '%':
                if (secondNumber != 0) {
                    result = firstNumber % secondNumber;
                    break;
                }
        }

        if (secondNumber == 0) {
            System.out.printf("Cannot divide %d by zero", firstNumber);
        } else {

            if (result % 2 == 0) {
                resultType = "even";
            } else resultType = "odd";

            if (symbol == '+' || symbol == '-' || symbol == '*') {
                System.out.printf("%d %c %d = %.0f - %s", firstNumber, symbol, secondNumber, result, resultType);
            } else if (symbol == '/') {
                System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, result);
            } else if (symbol == '%') {
                System.out.printf("%d / %d = %.0f", firstNumber, secondNumber, result);
            }

        }
    }
}