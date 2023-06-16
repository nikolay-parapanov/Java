package JUG_Academy;


public class Main3 {
    public static void main(String[] args) {
        String test = "a  ba";
        isPalindrome(test);
    }

    public static void isPalindrome(String test) {
        String clean = test.replaceAll("\\s+", "");
        boolean flag = true;
        char[] cleanArray = clean.toCharArray();

        for (int i = 0; i < cleanArray.length / 2; i++) {
            if (cleanArray[i] == cleanArray[cleanArray.length - i-1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}

