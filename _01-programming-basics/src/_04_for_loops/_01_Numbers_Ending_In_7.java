package _04_for_loops;

import java.util.Scanner;

public class _01_Numbers_Ending_In_7 {
    public static void main(String[] args) {
        System.out.println('7');
        for (int i = 1; i <= 99; i = i + 1) {
            String prefix = Integer.toString(i);
            System.out.println(prefix+'7');
        }
    }
}

