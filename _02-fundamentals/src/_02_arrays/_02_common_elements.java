package _02_arrays;

import java.util.Scanner;

public class _02_common_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");


        for (String elementOne : secondArray){
            for (String elementTwo : firstArray) {
                if (elementOne.equals(elementTwo)){
                    System.out.print(elementOne + " ");
                }
            }
        }
    }
}
