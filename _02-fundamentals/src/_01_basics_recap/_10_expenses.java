package _01_basics_recap;

import java.util.Scanner;

public class _10_expenses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        double cost = 0.0;

        int countHeadset = games / 2;
        int countMouse = games /3 ;
        int countKeyboard = games / 6;
        int countDisplay = games/ 12;

        cost= countHeadset * headsetPrice + countMouse * mousePrice + countKeyboard * keyboardPrice + countDisplay * displayPrice;


        System.out.printf("Rage expenses: %.2f lv.", cost);
    }
}
