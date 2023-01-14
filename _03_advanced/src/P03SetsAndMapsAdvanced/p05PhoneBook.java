package P03SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p05PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");
        Map<String, String> phoneBookMap = new HashMap<>();

        while (!input[0].equals("search")) {
            phoneBookMap.put(input[0], input[1]);
            input = scanner.nextLine().split("-");
        }

        String inputSearch = scanner.nextLine();
        while (!inputSearch.equals("stop")) {
            if (phoneBookMap.containsKey(inputSearch)) {
                System.out.printf("%s -> %S%n", inputSearch, phoneBookMap.get(inputSearch));
            } else System.out.printf("Contact %s does not exist.%n", inputSearch);
            inputSearch = scanner.nextLine();
        }

    }
}
