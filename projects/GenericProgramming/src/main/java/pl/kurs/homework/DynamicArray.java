package pl.kurs.homework;

import java.util.Arrays;

public class DynamicArray<E extends Object> {
    public E[] array;
    private int counter; //0


    public DynamicArray() {
        array = (E[]) new Object[10];
    }

    public void add(E element) {

        increaseSizeOrDoNothing();
        array[counter++] = element;

    }

    private void increaseSizeOrDoNothing() {
        if (counter + 1 == array.length)
            array = Arrays.copyOf(array, array.length * 2);

    }

    public void remove() {
        if (counter == 0) return;
        array[--counter] = null;
        decreaseSizeOrDoNothing();

    }

    private void decreaseSizeOrDoNothing() {
        if (array.length == 10) return;
        double ratio = counter * 100 / array.length;
        if (ratio <= 25)
            array = Arrays.copyOf(array, array.length / 2);

    }


}