package _04_for_loops;

import java.util.Scanner;

public class _04_Clever_Lily {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lillysYears = Integer.parseInt(sc.nextLine());
        double priceOfWashingMachine = Double.parseDouble(sc.nextLine());
        int pricePerToy = Integer.parseInt(sc.nextLine());

        int numberOfToys = 0;
        int currentMoneyReceived = 10;
        int totalMoneyReceived = 0;

        for (int i = 1; i <= lillysYears; i++) {
            if (i % 2 == 1) {
                numberOfToys += 1;
            } else {
                totalMoneyReceived += currentMoneyReceived;
                totalMoneyReceived -= 1;
                currentMoneyReceived += 10;
            }
        }

        int result = totalMoneyReceived + numberOfToys * pricePerToy;
        if (result >= priceOfWashingMachine) {
            System.out.printf("Yes! %.2f", (result - priceOfWashingMachine));
        } else System.out.printf("No! %.2f", Math.abs(result - priceOfWashingMachine));
    }
}

