package pl.kurs.zadanie5;

public abstract class Income {
    private double value;

    public Income(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
