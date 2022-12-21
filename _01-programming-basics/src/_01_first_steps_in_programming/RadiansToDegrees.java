package _01_first_steps_in_programming;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        double radians = Double.parseDouble(userInput);
        double resultDegrees = radians * 180 / Math.PI;
        System.out.println(resultDegrees);
    }
}
