package P07Generics.L01Jar;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("Pickles");
        jar.add("Onions");
        jar.remove();
    }
}
