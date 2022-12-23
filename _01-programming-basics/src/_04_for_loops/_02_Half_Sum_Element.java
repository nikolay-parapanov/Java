package _04_for_loops;

import java.util.Scanner;

public class _02_Half_Sum_Element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int totalSum = 0;
        int biggestNum = Integer.MIN_VALUE;

        for (int iteration = 1; iteration <= n; iteration++) {
            int currentNumber = Integer.parseInt(sc.nextLine());
            totalSum += currentNumber;
            if (currentNumber > biggestNum) {
                biggestNum = currentNumber;
            }
        }

        if (biggestNum == (totalSum - biggestNum)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggestNum);
        } else{
            int diff = Math.abs(biggestNum - (totalSum - biggestNum));
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
