package _02_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _04_rotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int numberOfElements = array.length;
        int numberOfRotations = Integer.parseInt(sc.nextLine());
        String helper = "";

        for (int i = 0; i < numberOfRotations; i++) {

            helper = array[0];
            for (int j = 0; j < numberOfElements - 1; j++) {
                array[j] = array[j + 1];
            }
            array[numberOfElements - 1] = helper;
        }
        for (String element : array) {
            System.out.print(element + " ");

        }
    }
}
