package P09FunctionalProgramming.L02SumNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> input = readInput(new Scanner(System.in));

        ToIntFunction<String> stringToIntFunction = str -> Integer.valueOf(str);

        int sum = input.stream()
                .mapToInt(stringToIntFunction)
                .sum();

        int count = input.size();

        System.out.println(count);
        System.out.println(sum);
    }


    private static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(", ");
        return Arrays.stream(split)
                .collect(Collectors.toList());
    }
}

