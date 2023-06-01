package P09FunctionalProgramming.L01SortEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> input = readInput(new Scanner(System.in));

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : input) {
            if (isEven.test(num)) {
                evenNumbers.add(num);
            }
        }

        String output = input.stream()
                .filter(isEven)
                .map(number -> number.toString())
                .collect(Collectors.joining(", "));

        String sortedOutput = input.stream()
                .filter(isEven)
                .sorted()
                .map(number -> number.toString())
                .collect(Collectors.joining(", "));

        System.out.println(output);
        System.out.println(sortedOutput);
    }

    private static List<Integer> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(", ");
        return Arrays.stream(split)
                .map(string -> Integer.valueOf(string))
                .collect(Collectors.toList());
    }
}
