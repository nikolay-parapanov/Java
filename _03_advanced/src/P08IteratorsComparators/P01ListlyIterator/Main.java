package P08IteratorsComparators.P01ListlyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] strings = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .toArray(String[]::new);

        ListlyIterator listIterator = new ListlyIterator(strings);


        String input = scanner.nextLine();

         while (!"END".equals(input)){
             switch (input){
                 case "Move":
                     System.out.println(listIterator.move());
                     break;
                 case "HasNext":
                     System.out.println(listIterator.hasNext());
                     break;
                 case "Print":
                     try {
                         System.out.println(listIterator.getCurrentElement());
                     } catch (UnsupportedOperationException ex) {
                         System.out.println(ex.getMessage());
                     }
                     break;
             }
             input = scanner.nextLine();
         }

    }
}
