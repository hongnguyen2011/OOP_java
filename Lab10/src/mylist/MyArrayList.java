package mylist;
import java.util.*;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size >= elements.length - 1) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        this.elements[index] = o;
        this.size++;
    }

    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    public void remove(int index) {
        checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.elements[size - 1] = null;
        this.size--;
    }
    public int size() {
        return this.size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}