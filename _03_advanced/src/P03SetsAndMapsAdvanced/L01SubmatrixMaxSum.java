package P03SetsAndMapsAdvanced;

import java.util.Scanner;

public class L01SubmatrixMaxSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrixInput(scanner);

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
        printMatrix(matrix);

    }

    private static int[][] readMatrixInput(Scanner scanner) {
        String[] matrixDimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixDimensions[0]);
        int cols = Integer.parseInt(matrixDimensions[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < currentRow.length; col++) {
                matrix[row][col] = Integer.parseInt(currentRow[col]);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

