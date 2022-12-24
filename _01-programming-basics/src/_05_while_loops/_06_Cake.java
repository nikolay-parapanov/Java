package _05_while_loops;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        int totalPieces = length * width;
        int totalPiecesCut = 0;

        String command = sc.nextLine();

        while (!command.equals("")) {
            if (!command.equals("STOP")) {
                int commandAsInt = Integer.parseInt(command);
                totalPiecesCut += commandAsInt;
                if (totalPiecesCut >= totalPieces) {
                    System.out.printf("No more cake left! You need %d pieces more.", totalPiecesCut - totalPieces);
                    break;
                }
            } else {
                System.out.printf("%d pieces are left.", totalPieces - totalPiecesCut);
                break;
            }
            command = sc.nextLine();
        }
    }
}