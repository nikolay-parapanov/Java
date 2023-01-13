package P02MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class p04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxSum = MIN_VALUE;
        int maxStartRow = 0;
        int maxStartCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int currentSum = subMatrixSum(matrix, row, col);
                if (maxSum < currentSum) {
                    maxSum= currentSum;
                    maxStartRow = row;
                    maxStartCol = col;
                }
            }
        }
        System.out.printf("Sum = %d\n",maxSum);
        for (int row = maxStartRow; row < maxStartRow+3; row++) {
            for (int col = maxStartCol; col < maxStartCol + 3; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int subMatrixSum(int[][] matrix, int row, int col) {
        int currentSum = 0;
        for (int rowInternalArr = row; rowInternalArr < (row + 3); rowInternalArr++) {
            for (int colInternalArr = col; colInternalArr < (col + 3); colInternalArr++) {
                currentSum += matrix[rowInternalArr][colInternalArr];
            }
        }
        return currentSum;
    }
}
