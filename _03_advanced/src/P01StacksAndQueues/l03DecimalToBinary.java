package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l03DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = readDecimal(sc);

        Deque<Integer> stack = new ArrayDeque<>();
        if (input == 0) {
            System.out.print(0);
        }

        while (input > 0) {
            stack.push(input % 2);
            input /= 2;
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }

    private static int readDecimal(Scanner sc) {
        return sc.nextInt();
    }
}
