package _02_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _08_magic_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Arrays Array;
        int [] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumNeeded = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==sumNeeded) {
                    System.out.println(numbers[i]+" "+numbers[j]);
                }

            }
        }
    }
}
