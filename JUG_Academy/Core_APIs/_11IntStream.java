package JUG_Academy.Core_APIs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _11IntStream {
    public static void main(String[] args) {
        List<String> inputItems = List.of("123", "abc", "456", "789", "xyz");
        IntStream output = numbers(inputItems);
        output.forEach(System.out::println);
    }

    public static java.util.stream.IntStream numbers(java.util.List<String> items) {
        var result = items
                .stream()
                .filter(i -> isValidInteger(i))
                .mapToInt(Integer::parseInt);

//        System.out.println("List<Integer>:");
//        result.forEach(System.out::println);

        return result;

    }

    private static boolean isValidInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
