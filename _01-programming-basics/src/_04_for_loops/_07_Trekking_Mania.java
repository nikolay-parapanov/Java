package _04_for_loops;

import java.util.Scanner;

public class _07_Trekking_Mania {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p1Musala = 0;
        int p2Monblan = 0;
        int p3Kilimadzharo = 0;
        int p4K2 = 0;
        int p5Everest = 0;

        int numberOfGroups = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= numberOfGroups; i++) {

            int currentGroupMembers = Integer.parseInt(sc.nextLine());

            if (currentGroupMembers <= 5) {
                p1Musala += currentGroupMembers;
            } else if (currentGroupMembers <= 12) {
                p2Monblan += currentGroupMembers;
            } else if (currentGroupMembers <= 25) {
                p3Kilimadzharo += currentGroupMembers;
            } else if (currentGroupMembers <= 40) {
                p4K2 += currentGroupMembers;
            } else p5Everest += currentGroupMembers;
        }
        double sumOfAllMembers = p1Musala + p2Monblan + p3Kilimadzharo + p4K2+ p5Everest;

        System.out.printf("%.2f%%\n", (p1Musala / sumOfAllMembers)*100);
        System.out.printf("%.2f%%\n", (p2Monblan / sumOfAllMembers)*100);
        System.out.printf("%.2f%%\n", (p3Kilimadzharo / sumOfAllMembers)*100);
        System.out.printf("%.2f%%\n", (p4K2 / sumOfAllMembers)*100);
        System.out.printf("%.2f%%\n", (p5Everest / sumOfAllMembers)*100);

    }
}
