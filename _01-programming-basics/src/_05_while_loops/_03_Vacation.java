package _05_while_loops;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double neededMoneyForTheExcursion = Double.parseDouble(sc.nextLine());
        double totalMoneySaved = Double.parseDouble(sc.nextLine());
        int counterSpendCommands = 0;
        int counterTotalDays = 0;

        double currentMoney = 0;

        String command = sc.nextLine();

        while (command.equals("spend") || command.equals("save")) {
            if (command.equals("spend")) {
                counterSpendCommands++;
                counterTotalDays++;
                currentMoney = Double.parseDouble(sc.nextLine());
                totalMoneySaved -= currentMoney;
                if (totalMoneySaved <0) {
                    totalMoneySaved = 0;
                }
                if (counterSpendCommands == 5) {
                    System.out.printf("You can't save the money.\n" +
                            "%d", counterTotalDays);
                    break;
                }
            } else if (command.equals("save")) {
                counterSpendCommands = 0;
                counterTotalDays++;
                currentMoney = Double.parseDouble(sc.nextLine());
                totalMoneySaved += currentMoney;
                if (totalMoneySaved >= neededMoneyForTheExcursion) {
                    System.out.printf("You saved the money for %d days.", counterTotalDays);
                    break;
                }
            }
            command = sc.nextLine();
        }

    }
}
