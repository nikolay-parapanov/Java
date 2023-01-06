package _04_lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_pokemon_dont_go {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements= 0;

        while (numbers.size()>0){
            int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index <= numbers.size()-1){
                int removedElement = numbers.get(index);
                sumRemovedElements += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index<0){
                int firstElementHelper = numbers.get(0);
                sumRemovedElements += firstElementHelper;
                numbers.remove(0);
                int lastElementHelper = numbers.get(numbers.size()-1);
                numbers.add(0,lastElementHelper);
                modifyList(numbers, firstElementHelper);
            } else if (index> numbers.size()-1){
                int lastElementHelper = numbers.get(numbers.size()-1);
                sumRemovedElements += lastElementHelper;
                numbers.remove(numbers.size()-1);
                numbers.add(numbers.get(0));
                modifyList(numbers, lastElementHelper);
            }
        }
        System.out.println(sumRemovedElements);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int indexInList = 0; indexInList <= numbers.size()-1; indexInList++) {
            int currentNumber = numbers.get(indexInList);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            numbers.set(indexInList, currentNumber);
        }
    }
}
