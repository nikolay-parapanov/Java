package _04_lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxNumberOfPassengersInWagon = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();
        String[] commandArr = command.split(" ");
        int wagonToCheck = 0;

        while (!commandArr[0].equals("end")) {
            if (commandArr[0].equals("Add")) {
                Integer wagonsToAddToEnd = Integer.parseInt(commandArr[1]);
                wagons.add(wagonsToAddToEnd);
            } else {
                int passengersToBoard = Integer.parseInt(commandArr[0]);

                while (passengersToBoard > 0) {
                    int currentWagonSeats = wagons.get(wagonToCheck);
                    if (currentWagonSeats < maxNumberOfPassengersInWagon) {
                        int availableSeats = maxNumberOfPassengersInWagon - currentWagonSeats;
                        if (availableSeats > passengersToBoard) {
                            wagons.set(wagonToCheck, wagons.get(wagonToCheck)+passengersToBoard);
                            passengersToBoard = 0;
                        } else {
                            wagons.set(wagonToCheck, wagons.get(wagonToCheck)+availableSeats);
                            passengersToBoard = passengersToBoard - availableSeats;
                            wagonToCheck += 1;
                        }
                    }
                }
            }

            command = sc.nextLine();
            commandArr = command.split(" ");
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
