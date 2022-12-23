package _04_for_loops;

import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nameOfActor = sc.nextLine();
        double initialPointsFromAcademy = Double.parseDouble(sc.nextLine());
        int numberOfJuryMembers = Integer.parseInt(sc.nextLine());

        double totalJuryPoints = initialPointsFromAcademy;

        for (int i = 1; i <= numberOfJuryMembers; i++) {
            String nameOfJuryMember = sc.nextLine();
            double inputJuryMemberPoints = Double.parseDouble(sc.nextLine());

            int len = nameOfJuryMember.length();
            double currentJuryPoints = len * inputJuryMemberPoints / 2;
            totalJuryPoints += currentJuryPoints;

            if (totalJuryPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, totalJuryPoints);
                break;
            }
        }
        if (totalJuryPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, (1250.5 - totalJuryPoints));
        }
    }
}
