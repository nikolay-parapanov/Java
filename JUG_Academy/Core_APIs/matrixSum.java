package JUG_Academy.Core_APIs;

public class matrixSum {
    public static void main(String[] args) {

    }

    public static long matrixSum() {
        long sum = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int num = scanner.nextInt();
                sum += num;
            }
        }

        scanner.close();
        return sum;
    }
}
