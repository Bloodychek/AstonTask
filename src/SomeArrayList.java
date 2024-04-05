import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SomeArrayList<E> {
    private E[] someArray;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    //create initial list
    public SomeArrayList() {
        this.someArray = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public SomeArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.someArray = (E[]) new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Capacity can't be less than 0!");
        }
    }

    private void grow(int newCapacity) {
        E[] newSomeArray = (E[]) new Object[newCapacity];
        System.arraycopy(someArray, 0, newSomeArray, 0, size);
        someArray = newSomeArray;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        return someArray[index];
    }

    public void set(int index, E element) {
        grow(this.size + 1);
        this.someArray[index] = element;
    }

    public void add(E item) {
        if (size == someArray.length - 1) {
            grow(someArray.length * 2);
        }
        someArray[size++] = item;
    }

    public void remove(int index) {
        for (int i = index; i < index; i++) {
            someArray[i] = someArray[i + 1];
        }
        someArray[index] = null;
        index--;
        if (someArray.length > DEFAULT_CAPACITY && index < someArray.length / 2) {
            grow(someArray.length / 2);
        }
    }

    @Override
    public String toString() {
        return "SomeArrayList{" +
                Arrays.toString(someArray) +
                ", size=" + size +
                '}';
    }
}
