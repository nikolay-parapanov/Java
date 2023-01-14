package P03SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        Map<String, String> emailsMap = new LinkedHashMap<>();

        String userInput = scanner.nextLine();
        while (!userInput.equals("stop")) {
            String name = userInput;
//                emailsMap.put(userInput,"");
            userInput = scanner.nextLine();
            String fullEmail = userInput;
            String[] stringArr = userInput.split("\\.");
            String domainEnd = stringArr[stringArr.length - 1];
            if (!domainEnd.equalsIgnoreCase("us") && !domainEnd.equalsIgnoreCase("com") && !domainEnd.equalsIgnoreCase("uk")) {
                emailsMap.put(name, fullEmail);
            }
            userInput = scanner.nextLine();
        }
        for (var pair : emailsMap.entrySet()) {
            System.out.printf("%s -> %s%n", pair.getKey(), pair.getValue());

        }
    }
}

