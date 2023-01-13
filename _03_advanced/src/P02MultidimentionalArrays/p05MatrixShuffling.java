package P02MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            if (!command[0].equals("swap") || command.length != 5) {
                System.out.println("Invalid input!");
            } else {

                int firstRow = Integer.parseInt(command[1]);
                int firstCol = Integer.parseInt(command[2]);
                int secondRow = Integer.parseInt(command[3]);
                int secondCol = Integer.parseInt(command[4]);

                if (firstRow < rows && firstCol < cols && secondRow < rows && secondCol < cols) {

                    String helper = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = helper;

                    printCurrentMatrixState(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            }
            command = scanner.nextLine().split("\\s+");
        }
    }

    private static void printCurrentMatrixState(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
