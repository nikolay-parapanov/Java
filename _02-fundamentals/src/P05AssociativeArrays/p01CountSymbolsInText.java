package P05AssociativeArrays;

import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.Map;
import java.util.LinkedHashMap;
public class p01CountSymbolsInText {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String text = sc.nextLine() ;
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()){
            if (symbol==' '){
                continue;
            }
            if (!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol,1);
            }
            else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
