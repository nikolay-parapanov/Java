package JUG_Academy;

public class Main4 {
    public static void main(String[] args) {

        isAnagram("abcd", "bacf");
    }

    public static void isAnagram(String first, String second) {
        char[] char1 = first.toCharArray();
        char[] char2 = second.toCharArray();
        boolean flag = true;
        if (char2.length != char1.length) {
            flag = false;
        } else {
            for (int i = 0; i < char1.length; i++) {
                if (!second.contains("" + char1[i])) {
                    flag = false;
                    break;
                }
            }

        }
        System.out.println(flag);
    }
}