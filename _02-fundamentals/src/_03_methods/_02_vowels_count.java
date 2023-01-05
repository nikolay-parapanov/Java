package _03_methods;

import java.util.Scanner;

public class _02_vowels_count {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);

    }
    private static void printVowelsCount (String text){
        int count = 0;

        for (char symbol: text.toCharArray()){
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' ||symbol == 'u') {
                count ++;
            }

        }
        System.out.println(count);
    }
}
