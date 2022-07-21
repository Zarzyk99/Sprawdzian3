package pl.kurs;

import java.util.Arrays;

public class ArraysPair<T, U> { //używamy E lub T/U/S ewqentualnie K i V co oznacza klucz i

    private T[] firstArray;
    private U[] secondArray;

    public ArraysPair(T[] firstArray, U[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public T[] getFirstArray() {
        return firstArray;
    }

    public void setFirstArray(T[] firstArray) {
        this.firstArray = firstArray;
    }

    public U[] getSecondArray() {
        return secondArray;
    }

    public void setSecondArray(U[] secondArray) {
        this.secondArray = secondArray;
    }

    @Override
    public String toString() {
        return "ArraysPair{" +
                "firstArray=" + Arrays.toString(firstArray) +
                ", secondArray=" + Arrays.toString(secondArray) +
                '}';
    }


    public boolean arraysHaveSameType(){
        return firstArray.getClass() == secondArray.getClass();
    }
    public boolean arraysHaveSameLength(){
        return firstArray.length == secondArray.length;
    }
}
