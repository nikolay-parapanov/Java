package P07Generics.L01Jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> jarStack = new ArrayDeque<T>();

    public void add(T element) {
        this.jarStack.add(element);
    }


    public T remove() {
        return jarStack.remove();
    }
}

