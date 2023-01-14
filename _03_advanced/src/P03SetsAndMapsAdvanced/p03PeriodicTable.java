package P03SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03PeriodicTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCompounds = Integer.parseInt(scanner.nextLine());
        Set<String> allElements = new TreeSet<>();

        while (countCompounds-- >0){
            String[] compoundsInput = scanner.nextLine().split("\\s+");
            allElements.addAll(Arrays.asList(compoundsInput));
        }

        System.out.println((String.join(" ", allElements)));
    }
}
