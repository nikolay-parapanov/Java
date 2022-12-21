package _01_first_steps_in_programming;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yearly_fee = Integer.parseInt(sc.nextLine());

        double sneakers = yearly_fee * 0.6;
        double jersey = sneakers * 0.8;
        double ball = jersey * 0.25;
        double accessories = ball * 0.2;

        double total_expenses = yearly_fee + sneakers + jersey + ball + accessories;

        System.out.println(total_expenses);
    }
}

