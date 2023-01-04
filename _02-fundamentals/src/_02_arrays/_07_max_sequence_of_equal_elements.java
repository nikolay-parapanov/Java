package _02_arrays;

import java.util.Scanner;

public class _07_max_sequence_of_equal_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int finalCounter = 1;
        int currentCounter = 1;

        String[] arrayUserInput = sc.nextLine().split(" ");
        int finalLeftIndex = 0;
        int finalRightIndex = 0;
        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for (int i = 0; i < arrayUserInput.length-1; i++) {
            if (arrayUserInput[i].equals(arrayUserInput[i+1])) {
                currentCounter++;
                currentRightIndex = i+1;
            } else {
                currentLeftIndex = i+1;
                currentRightIndex = i+1;
                currentCounter = 1;
            }
            if (currentCounter>finalCounter){
                finalCounter = currentCounter;
                finalLeftIndex = currentLeftIndex;
                finalRightIndex = currentRightIndex;
            }
        }
        for (int i = finalLeftIndex; i <= finalRightIndex; i++) {
            System.out.print(arrayUserInput[i]+" ");
        }
    }
}

