package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] commandsSet = scanner.nextLine().split("\\s+");
        String [] inputNumbers = scanner.nextLine().split("\\s+");

        int numbersToOffer = Integer.parseInt(commandsSet[0]);
        int numbersToPoll = Integer.parseInt(commandsSet[1]);
        int numberToSearch = Integer.parseInt(commandsSet[2]);

        ArrayDeque<Integer> dequeAsInt = new ArrayDeque<>();

        for (int i = 0; i < numbersToOffer; i++) {
            dequeAsInt.offer(Integer.parseInt(inputNumbers[i]));
        }
        for (int i = 0; i < numbersToPoll; i++) {
            dequeAsInt.poll();
        }

        if (dequeAsInt.isEmpty()){
            System.out.println("0");
        }else if (dequeAsInt.contains(numberToSearch)){
            System.out.println("true");
        }else System.out.println(Collections.min(dequeAsInt));
    }
}
