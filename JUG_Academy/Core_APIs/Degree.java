package JUG_Academy.Core_APIs;

public class Degree {
    public static void main(String[] args) {

    }

    public static java.util.function.Function<Integer, java.math.BigInteger> degree(int n){
        return x -> java.math.BigInteger.valueOf(x).pow(n);
    }
}
