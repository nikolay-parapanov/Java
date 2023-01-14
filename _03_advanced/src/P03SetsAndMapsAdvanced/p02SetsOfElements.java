package P03SetsAndMapsAdvanced;

import java.util.*;

public class p02SetsOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] setsLength = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int setLength1 = setsLength[0];
        int setLength2 = setsLength[1];

        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> intersection = new LinkedHashSet<>();
        while (setLength1-- > 0) {
            String inputItems = scanner.nextLine();
            set1.add(inputItems);
        }
        while (setLength2-- > 0) {
            String inputItems = scanner.nextLine();
            set2.add(inputItems);
        }
        intersection = set1;
        intersection.retainAll(set2);
        System.out.println(String.join(" ",intersection));
    }
}
