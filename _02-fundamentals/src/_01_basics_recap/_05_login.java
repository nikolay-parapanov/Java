package _01_basics_recap;

import java.util.Scanner;

public class _05_login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = "";
        int counter = 1;
        boolean flag = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String confirmPassword = sc.nextLine();

        while (!password.equals(confirmPassword)) {
            System.out.println("Incorrect password. Try again.");
            counter += 1;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", username);
                flag = true;
                break;
            }
            confirmPassword = sc.nextLine();
        }
        if (!flag) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
