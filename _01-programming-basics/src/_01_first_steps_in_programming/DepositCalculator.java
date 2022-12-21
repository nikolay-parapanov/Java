package _01_first_steps_in_programming;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double depositSum = Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        double yearlyInterest = Double.parseDouble(sc.nextLine());

        double result = depositSum + months * ((depositSum * yearlyInterest/100) / 12);
        System.out.println(result);

        }
    }

