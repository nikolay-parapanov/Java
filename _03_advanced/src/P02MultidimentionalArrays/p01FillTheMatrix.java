package P02MultidimentionalArrays;

import java.util.Scanner;

public class p01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userInput = scanner.nextLine().split(", ");
        int n = Integer.parseInt(userInput[0]);
        String pattern = userInput[1];

        int counter = 1;
        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            fillMatrixPatternA(n, counter, matrix);

        } else {
            fillMatrixPatternB(n, counter, matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternA(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = counter;
                counter++;
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int n, int counter, int[][] matrix) {
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
                System.out.println();
            } else {

                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
                System.out.println();

            }
        }
    }
}