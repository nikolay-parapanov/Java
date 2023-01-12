package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stackAsInt = new ArrayDeque<>();

        for (int i = 0; i < countOfCommands; i++) {
            String[] currentCommand = scanner.nextLine().split("\\s+");
            if (currentCommand[0].equals("1")) {
                stackAsInt.push(Integer.parseInt(currentCommand[1]));
            } else if (currentCommand[0].equals("2")) {
                stackAsInt.pop();
            } else {
                System.out.println(Collections.max(stackAsInt));
            }
        }
    }
}
