package _01_basics_recap;

import java.util.Scanner;

public class _08_triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
//        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                String output = i + " ";
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
