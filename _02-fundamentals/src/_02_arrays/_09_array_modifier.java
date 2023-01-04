package _02_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _09_array_modifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] command = sc.nextLine().split(" ");
        int helper;
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int swapIndexFirstNumber = Integer.parseInt(command[1]);
                    int swapIndexSecondNumber = Integer.parseInt(command[2]);
                    helper = numbers[swapIndexFirstNumber];
                    numbers[swapIndexFirstNumber] = numbers[swapIndexSecondNumber];
                    numbers[swapIndexSecondNumber] = helper;
                    break;
                case "multiply":
                    int multiplyIndexFirstNumber = Integer.parseInt(command[1]);
                    int multiplyIndexSecondNumber = Integer.parseInt(command[2]);
                    numbers[multiplyIndexFirstNumber] = numbers[multiplyIndexFirstNumber] * numbers[multiplyIndexSecondNumber];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }
            command = sc.nextLine().split(" ");
        }

        for (int i=0; i<numbers.length; i++){
            if (i== numbers.length-1){
                System.out.print(numbers[i]);
            } else System.out.print(numbers[i] + ", ");
        }
    }
}
