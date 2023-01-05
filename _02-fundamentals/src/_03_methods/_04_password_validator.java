package _03_methods;

import java.util.Scanner;

public class _04_password_validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean flag = true;

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            flag = false;
        }
        if (!isContentValid(password)){
            System.out.println("Password must consist only of letters and digits");
            flag = false;
        }
        if (!isValidCountDigits(password)){
            System.out.println("Password must have at least 2 digits");
            flag = false;
        }

        if (flag){
            System.out.println("Password is valid");
        }

    }

    private static boolean isValidLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isContentValid(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCountDigits(String password) {
        int countDigits = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return (countDigits >= 2);

    }
}
