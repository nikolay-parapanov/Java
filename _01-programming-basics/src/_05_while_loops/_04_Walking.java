package _05_while_loops;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int targetSteps = 10000;
        int totalStepsMade = 0;
        String command = sc.nextLine();

        while (!command.equals("")) {

            if (command.equals("Going home")) {
                totalStepsMade += Integer.parseInt(sc.nextLine());
                break;
            } else {
                int commandAsInt = Integer.parseInt(command);
                totalStepsMade += commandAsInt;
            }
            command = sc.nextLine();
        }

        if (totalStepsMade >= targetSteps) {
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", totalStepsMade - targetSteps);
        } else System.out.printf("%d more steps to reach goal.", targetSteps - totalStepsMade);
    }
}
