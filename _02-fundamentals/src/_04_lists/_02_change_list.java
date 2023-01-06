package _04_lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_change_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();
        String[] commandArr = command.split(" ");

        while (!commandArr[0].equals("end")) {
            if (commandArr[0].equals("Delete")) {
                int numberToDelete = Integer.parseInt(commandArr[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == numberToDelete) {
                        numbers.remove(i);
                    }
                }
            } else if (commandArr[0].equals("Insert")){
                int positionToAdd = Integer.parseInt(commandArr[1]);
                int valueToAdd = Integer.parseInt(commandArr[2]);
                numbers.add(valueToAdd,positionToAdd);
            }
            commandArr = sc.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
