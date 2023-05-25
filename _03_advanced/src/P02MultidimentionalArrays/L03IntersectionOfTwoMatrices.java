package P02MultidimentionalArrays;

import java.util.Scanner;

public class L03IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readCharMatrix(scanner, rows);
        char[][] secondMatrix = readCharMatrix(scanner, rows);
        char[][] resultMatrix = new char[rows][cols];

//        printMatrix(firstMatrix);
//        printMatrix(secondMatrix);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == (secondMatrix[row][col])) {
                    resultMatrix[row][col] = firstMatrix[row][col];
                } else {
                    resultMatrix[row][col] = '*';
                }
            }
        }
        printMatrix(resultMatrix);
    }

    private static char[][] readCharMatrix(Scanner scanner, int rows) {

        char[][] matrix = new char[rows][];

        for (int row = 0; row < rows; row++) {
            String inputRowAsString = scanner.nextLine();
            String strippedInputLine = inputRowAsString.replaceAll("\\s+", "");
            matrix[row] = strippedInputLine.toCharArray();
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("none");
        } else {
            int rows = matrix.length;
            int cols = matrix[0].length;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}