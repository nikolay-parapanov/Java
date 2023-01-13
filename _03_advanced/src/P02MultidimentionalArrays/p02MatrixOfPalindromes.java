package P02MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = userInput[0];
        int cols = userInput[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = "" + (char)(row+97) + (char)(row + col+97) + (char)(row + 97) + "";
            }
            System.out.println();
        }

        for (String[] row : matrix) {
            for (String element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
