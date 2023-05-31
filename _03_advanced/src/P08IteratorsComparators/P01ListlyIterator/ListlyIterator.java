package P08IteratorsComparators.P01ListlyIterator;

import java.util.Arrays;
import java.util.List;

public class ListlyIterator {
    private List<String> elements;
    private int index;

    public ListlyIterator(String... values) {
        this.elements = Arrays.asList(values);
        this.index = 0;
    }

    public boolean move() {
        if (!this.hasNext()) {
            return false;
        }
        this.index++;
        return true;
    }

    public boolean hasNext() {
        return this.index < this.elements.size();
    }

    public String getCurrentElement() {
        if (this.elements.size() == 0) {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        return this.elements.get(this.index);
    }
}
