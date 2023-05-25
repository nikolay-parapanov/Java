package P02MultidimentionalArrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L02PositionsOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrixOfIntegers(scanner);
        Deque<String> answers = new ArrayDeque<>();

//        printMatrixOfIntegers(matrix);
        int lookUpNumber = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (lookUpNumber == (matrix[row][col])) {
//                    System.out.println(row + " " + col );
                    answers.add(row + " " + col);
                }
            }
        }
        if (answers.isEmpty()) {
            System.out.println("not found");
        }
        while (!answers.isEmpty()){
            System.out.println(answers.poll());
        }
    }


    private static int[][] readMatrixOfIntegers(Scanner scanner) {
        String[] rowsColsSplit = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(rowsColsSplit[0]);
        int cols = Integer.parseInt(rowsColsSplit[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String currentRow = scanner.nextLine();
            String[] currentRowSplit = currentRow.split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(currentRowSplit[col]);
            }
        }

        return matrix;
    }

    private static void printMatrixOfIntegers(int[][] matrix) {
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
