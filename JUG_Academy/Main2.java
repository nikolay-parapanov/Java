package JUG_Academy;

public class Main2 {
    public static void main(String[] args) {

        isPower(8);
    }

    public static void isPower(int number) {
        boolean flag = false;
        while (number > 2) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                break;
            }
        }

        if (number == 2 || number == 1) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }
}
