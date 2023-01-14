package P03SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p01UniqueUsernames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> itemsSet = new LinkedHashSet<>();

        while (n-- > 0) {
            String currentInput = scanner.nextLine();
            itemsSet.add(currentInput);
        }

        itemsSet.forEach(System.out::println);
    }
}

