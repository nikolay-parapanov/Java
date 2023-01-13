package P02MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int primary = 0;
        int secondary = 0;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col) {
                    primary += matrix[row][col];
                }
                if (row + col == n-1){
                    secondary += matrix[row][col];
                }
            }
        }
        System.out.println(Math.abs(primary-secondary));

    }
}
