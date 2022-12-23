package _04_for_loops;

import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNumber = sc.nextInt();
            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber <= 399) {
                p2++;
            } else if (currentNumber <= 599) {
                p3++;
            } else if (currentNumber <= 799) {
                p4++;
            } else {
                p5++;
            }
        }
        double sumOfAllNumbers = p1 + p2 + p3 + p4 + p5;

        System.out.printf("%.2f%%\n", (p1 / sumOfAllNumbers)*100);
        System.out.printf("%.2f%%\n", (p2 / sumOfAllNumbers)*100);
        System.out.printf("%.2f%%\n", (p3 / sumOfAllNumbers)*100);
        System.out.printf("%.2f%%\n", (p4 / sumOfAllNumbers)*100);
        System.out.printf("%.2f%%\n", (p5 / sumOfAllNumbers)*100);
    }
}