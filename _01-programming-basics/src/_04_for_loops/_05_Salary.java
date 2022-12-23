package _04_for_loops;

import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfTabs = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());

        int totalPenalty = 0;

        for (int i = 1; i <= numberOfTabs; i++) {
            String currentTab = sc.nextLine();
            switch (currentTab) {
                case "Facebook":
                    totalPenalty += 150;
                    break;
                case "Instagram":
                    totalPenalty += 100;
                    break;
                case "Reddit":
                    totalPenalty += 50;
                    break;
                default:
            }

            if (totalPenalty >= salary) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (totalPenalty < salary) {
            System.out.printf("%.0f", (salary - totalPenalty));
        }

    }
}