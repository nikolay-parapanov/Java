package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l02SimpleCalculator {
    public static void main(String[] args) {
        String input = readInput();
        String[] symbols = input.split("\\s+");

        if (symbols.length == 0){
            return;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(symbols[0]));

        for (int i = 1; i < symbols.length; i++) {
            String operation = symbols[i];
            int num = Integer.parseInt(symbols[++i]);
            int stackNum = stack.pop();

            if ("+".equals(operation)){
                stack.push(num + stackNum);
            } else if ("-".equals(operation)){
                stack.push((stackNum - num));
            }
        }
        System.out.println(stack.pop());

    }

    private static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
