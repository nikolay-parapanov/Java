package P02MultidimentionalArrays;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07CrossFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> field = new ArrayList<>();

        int counter = 1;
        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                numbers.add(counter++);
            }
            field.add(numbers);
        }


        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] tokens = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = tokens[0];
            int col = tokens[1];
            int radius = tokens[2];

            for (int i = col- radius; i <= col + radius; i++) {
                if (row >=0 && row < field.size() && i >= 0 && i <field.get(row).size()) {
                    field.get(row).set(i, -1);
                }
            }

            for (int i = row - radius; i <= row + radius; i++) {
                if (i>=0 && i< field.size() && col >= 0 && col < field.get(i).size()) {
                    field.get(i).set(col, -1);
                }
            }
            for (ArrayList<Integer> integers : field) {
                removeNegativeValues(integers);
            }

            field.removeIf(ArrayList::isEmpty);
//            field= field.stream()
//                    .filter(l->!l.isEmpty())
//                    .collect(Collectors.toCollection(ArrayList::new));


            input = scanner.nextLine();
        }

        printMatrix(field);
    }

    private static void removeNegativeValues(ArrayList<Integer> currentRow) {
        while (currentRow.contains(-1)) {
            currentRow.remove(currentRow.indexOf(-1));
        }
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
