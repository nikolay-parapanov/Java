package P09FunctionalProgramming.P03CountUppercaseWords;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> input = readInput(new Scanner(System.in));
        Predicate<String> startsWithCapitalCase = (word) -> Character.isUpperCase(word.charAt(0));

        List<String> upperCaseWords = input.stream()
                .filter(startsWithCapitalCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(word -> System.out.println(word));


    }

    private static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        return Arrays.stream(split)
                .collect(Collectors.toList());
    }
}



