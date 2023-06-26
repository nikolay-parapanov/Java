package JUG_Academy.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindSum {
    public static void main(String[] args) {
        int[] input = {2, 4, 6, 8, 10};
        int targetSum = 14;

        int[] finalResult = findSum(input, targetSum);

        for (int i : finalResult) {
            System.out.print(i + " ");
        }
    }

    public static int[] findSum(int[] numbers, int targetSum) {
        java.util.HashSet<Integer> resultSet = new java.util.HashSet<>();

        for (int index1 = 0; index1 < numbers.length; index1++) {
            for (int index2 = index1 + 1; index2 < numbers.length; index2++) {
                if (numbers[index1] + numbers[index2] == targetSum) {
                    resultSet.add(numbers[index1]);
                    resultSet.add(numbers[index2]);
                    if (resultSet.size() == 2) {
                        int[] resultInt = new int[2];
                        int count = 0;
                        for (Integer integer : resultSet) {
                            resultInt[count] = integer;
                            count++;
                        }
                        return resultInt;
                    }
                }
            }
        }
        return new int[0];
    }
}
