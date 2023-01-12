package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSequence = scanner.nextLine();

        ArrayDeque<Character> stackSigns = new ArrayDeque<>();
        boolean flag = true;

        for (int i = 0; i < inputSequence.length(); i++) {
            char currentSign = inputSequence.charAt(i);
            if (currentSign == '(' || currentSign == '[' || currentSign == '{') {
                stackSigns.push(currentSign);
            } else {
                if (stackSigns.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    char openingBracket = stackSigns.pop();
                    if (currentSign == ')' && openingBracket != '(') {
                        flag = false;
                        break;
                    } else if (currentSign == ']' && openingBracket != '[') {
                        flag = false;
                        break;
                    } else if (currentSign == '}' && openingBracket != '{') {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (stackSigns.isEmpty() && flag) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}

