package _05_while_loops;

import java.util.Scanner;

public class _01_Old_Books {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bookUserInput = sc.nextLine();

        String currentInput = sc.nextLine();
        int counter = 0;
        boolean isFound = false;

        while (!currentInput.equals("No More Books")) {
            if (currentInput.equals(bookUserInput)) {
                isFound = true;
                break;
                }
            counter++;
            currentInput = sc.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else System.out.printf("The book you search is not here!\n" +
                "You checked %d books.\n", counter);
    }
}
