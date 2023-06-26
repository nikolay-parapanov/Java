public class FindMax {


    public static void main(String[] args) {

//        System.out.println(findMax(intArray));
//        System.out.println(findMax(intArray));
//        System.out.println(findMax(intArray));

    }

    public static <T extends Comparable<T>> T findMax(T... elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        T max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }
}