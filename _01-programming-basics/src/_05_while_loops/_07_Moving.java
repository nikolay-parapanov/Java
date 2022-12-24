package _05_while_loops;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int heigth = Integer.parseInt(sc.nextLine());

        int totalAvailableSpace = width * length * heigth;

        String command = sc.nextLine();

        while (!command.equals("")) {
            if (!command.equals("Done")) {
                int commandAsInt = Integer.parseInt(command);
                totalAvailableSpace -= commandAsInt;
                if (totalAvailableSpace <=0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalAvailableSpace));
                    break;
                }
            } else{
                System.out.printf("%d Cubic meters left.", Math.abs(totalAvailableSpace));
                break;
            }
            command = sc.nextLine();
        }

    }
}
