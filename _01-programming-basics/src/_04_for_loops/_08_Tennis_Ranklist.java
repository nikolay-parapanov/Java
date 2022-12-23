package _04_for_loops;

import java.util.Scanner;

public class _08_Tennis_Ranklist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numberOfTournaments = Integer.parseInt(sc.nextLine());
        int initialPoints = Integer.parseInt(sc.nextLine());
        int totalPoints = initialPoints;
        int counterWins = 0;
        for (int i = 1; i <= numberOfTournaments; i++) {
            String status = sc.nextLine();
            if ("W".equals(status)) {
                totalPoints += 2000;
                counterWins += 1;
            } else if ("F".equals(status)) {
                totalPoints += 1200;
            } else if ("SF".equals(status)) {
                totalPoints += 720;
            }
        }

        double averagePoints = (totalPoints - initialPoints) / numberOfTournaments;
        double winsPercentage = counterWins / numberOfTournaments;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", winsPercentage*100);
    }
}
