package P02MultidimentionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p06MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        int rotationNumber = Integer.parseInt(rotation.split("[()]")[1]);
        int angleOfRotation = rotationNumber % 360;
        String input = scanner.nextLine();

        List<String> temporary = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {

            if (maxLength < input.length()) {
                maxLength = input.length();
            }
            temporary.add(input);
            input = scanner.nextLine();
        }
        int rows = temporary.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        populateTheMatrix(temporary, rows, cols, matrix);

        switch (angleOfRotation){
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]+"");
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows-1; row >=0 ; row--) {
                        System.out.print(matrix[row][col]+"");
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows-1; row >=0 ; row--) {
                    for (int col = cols-1; col >=0 ; col--) {
                        System.out.print(matrix[row][col]+"");
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols-1; col >=0 ; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]+"");
                    }
                    System.out.println();
                }
                break;
        }
    }

    private static void populateTheMatrix(List<String> temporary, int rows, int cols, char[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String currentWord = temporary.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
