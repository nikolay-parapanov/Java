package JUG_Academy.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegatives {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(removeNegatives(numbers));
    }

    public static java.util.List<Integer> removeNegatives(java.util.List<Integer> numbers){
        java.util.List<Integer> resultPositiveNumbers = new java.util.ArrayList<>();

        for (Integer number : numbers) {
            if (number>=0) {
                resultPositiveNumbers.add(number);
            }
        }
        return resultPositiveNumbers;
    }
}
