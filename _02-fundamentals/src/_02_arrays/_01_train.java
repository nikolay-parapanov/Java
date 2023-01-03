package _02_arrays;

import java.util.Scanner;

public class _01_train {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(sc.nextLine());

        int[] train = new int[countOfWagons];
        int sumOfPassengers = 0;

        for (int i = 0; i < countOfWagons; i++) {
            train[i] = Integer.parseInt(sc.nextLine());
            sumOfPassengers += train[i];
        }

        for (int wagon: train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sumOfPassengers);
    }
}
