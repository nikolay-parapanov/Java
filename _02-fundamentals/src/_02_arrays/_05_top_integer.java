package _02_arrays;

import java.util.Scanner;

public class _05_top_integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arrayString = sc.nextLine().split(" ");
        int[] arrayInt = new int[arrayString.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }

        int currentBiggest;
        int biggestFromRemaining;

        for (int i = 0; i < arrayInt.length - 1; i++) {
            currentBiggest = arrayInt[i];
            biggestFromRemaining = arrayInt[i+1];
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (biggestFromRemaining < arrayInt[j]) {
                    biggestFromRemaining = arrayInt[j];
                }
            }
            if (currentBiggest > biggestFromRemaining) {
                System.out.print(currentBiggest + " ");
            } else biggestFromRemaining = currentBiggest;
        }
        System.out.print(arrayInt[arrayInt.length - 1] + " ");
    }
}

