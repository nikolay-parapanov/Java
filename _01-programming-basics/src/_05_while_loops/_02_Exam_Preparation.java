package _05_while_loops;

import java.util.Scanner;

public class _02_Exam_Preparation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfBadMarks = Integer.parseInt(sc.nextLine());
        int currentSumOfBadMarks = 0;
        double counterOfTotalMarks = 0;
        int sumOfTotalMarks = 0;
        String command = sc.nextLine();
        String lastProblem = "";

        while (!command.equals("Enough")) {
            int currentMark = Integer.parseInt(sc.nextLine());
            sumOfTotalMarks += currentMark;
            counterOfTotalMarks++;
            if (currentMark <= 4) {
                currentSumOfBadMarks++;
                if (currentSumOfBadMarks == numberOfBadMarks) {
                    System.out.printf("You need a break, %d poor grades.", currentSumOfBadMarks);
                    break;

                }
            }
            lastProblem = command;
            command = sc.nextLine();
        }
        double averageMark = sumOfTotalMarks / counterOfTotalMarks;
        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %.0f\n" +
                    "Last problem: %s\n", averageMark, counterOfTotalMarks, lastProblem);
        }
    }
}

