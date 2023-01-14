package P03SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p04CountSymbols {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            symbolMap.putIfAbsent(currentSymbol,0);

            int currentOccurences = symbolMap.get(currentSymbol);
            symbolMap.put(currentSymbol,currentOccurences+1);

        }
        for (Map.Entry<Character, Integer> pair: symbolMap.entrySet()){
            System.out.printf("%s: %d time/s\n", pair.getKey(), pair.getValue() );
        }

    }
}
