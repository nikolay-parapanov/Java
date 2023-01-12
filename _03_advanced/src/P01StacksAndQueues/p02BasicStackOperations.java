package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.*;

public class p02BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] userInput = scanner.nextLine().split("\\s+");
        String[] numbers = scanner.nextLine().split("\\s+");

        int numbersToPush = Integer.parseInt(userInput[0]);
        int numbersToPop = Integer.parseInt(userInput[1]);
        int numberToSearch = Integer.parseInt(userInput[2]);

        ArrayDeque<Integer> stackAsInt = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            int currentNumberAsInt = Integer.parseInt(numbers[i]);
            stackAsInt.push(currentNumberAsInt);
        }

        for (int i = 0; i < numbersToPop; i++) {
            stackAsInt.pop();
        }

        if (stackAsInt.isEmpty()) {
            System.out.println("0");
        } else if (stackAsInt.contains(numberToSearch)) {
            System.out.println("true");
        } else System.out.println(Collections.min(stackAsInt));

    }
}
