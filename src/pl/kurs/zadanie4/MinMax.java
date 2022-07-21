package pl.kurs.zadanie4;

public class MinMax<T extends Comparable> {
    private T max;
    private T min;

    public MinMax(T max, T min) {
        this.max = max;
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "max=" + max +
                ", min=" + min +
                '}';
    }
}
