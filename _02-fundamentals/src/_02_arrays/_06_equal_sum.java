package _02_arrays;

import java.util.Scanner;

public class _06_equal_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] userInput = sc.nextLine().split(" ");
        int[] numbers = new int[userInput.length];

        for (int i = 0; i < userInput.length; i++) {
            numbers[i] = Integer.parseInt(userInput[i]);
        }
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i+1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("no");
        }


    }
}
