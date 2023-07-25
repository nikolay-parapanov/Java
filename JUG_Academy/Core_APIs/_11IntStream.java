package JUG_Academy.Core_APIs;

import java.util.List;
import java.util.stream.Collectors;

public class _11IntStream {
    public static void main(String[] args) {
        List<String> inputList = List.of("123", "abc", "456", "789", "xyz");

        List<String> result = inputList
                .stream()
                .filter(_11IntStream::isValidInteger)
                .toList();

        result.forEach(System.out::println);

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
