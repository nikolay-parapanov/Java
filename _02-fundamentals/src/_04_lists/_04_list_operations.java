package _04_lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_list_operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int positionToInsert = Integer.parseInt(command.split("\\s+")[2]);
                if (positionToInsert <= numbers.size()-1 && positionToInsert >= 0) {
                    numbers.add(positionToInsert, numberToInsert);
                } else System.out.println("Invalid index");

            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (indexToRemove < numbers.size()-1 && indexToRemove >= 0) {
                    numbers.remove(indexToRemove);
                } else System.out.println("Invalid index");

            } else if (command.contains("Shift left")) {
                int numberOfShiftsLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < numberOfShiftsLeft; i++) {
                    int helper = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(helper);
                }
            } else if (command.contains("Shift right")) {
                int numberOfShiftsRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < numberOfShiftsRight; i++){
                    int helper = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,helper);
                }
            }
            command = sc.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
