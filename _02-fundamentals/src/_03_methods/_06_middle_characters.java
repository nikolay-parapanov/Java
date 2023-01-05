package _03_methods;

import java.util.Scanner;

public class _06_middle_characters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        printMiddleChar(userInput);

    }

    public static void printMiddleChar(String text) {
        char [] textArr = text.toCharArray();
        int symbol = text.length() / 2;
        if (textArr.length % 2 == 0) {
            System.out.printf("%s%s\n", textArr[symbol-1], textArr[symbol]);
        } else System.out.println(textArr[symbol]);
    }
}
