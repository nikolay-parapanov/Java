package JUG_Academy.Core_APIs;
import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {
        // Testing the fib() function
        fib().limit(10).forEach(fibNumber -> System.out.println(fibNumber.getCurrent()));
    }

    public static Stream<FibNumber> fib() {
        return Stream.iterate(new FibNumber(BigInteger.ZERO, BigInteger.ONE),
                fibNumber -> new FibNumber(fibNumber.getCurrent(), fibNumber.getPrevious().add(fibNumber.getCurrent())));
    }

    static class FibNumber {
        private final BigInteger previous;
        private final BigInteger current;

        public FibNumber(BigInteger previous, BigInteger current) {
            this.previous = previous;
            this.current = current;
        }

        public BigInteger getPrevious() {
            return previous;
        }

        public BigInteger getCurrent() {
            return current;
        }
    }
}