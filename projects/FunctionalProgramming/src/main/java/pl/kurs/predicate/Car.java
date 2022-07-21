package pl.kurs.predicate;

import java.util.Objects;

public class Car {
    private String producer;
    private String model;
    private boolean crashed;

    public Car(String producer, String model, boolean crashed) {
        this.producer = producer;
        this.model = model;
        this.crashed = crashed;
    }

    public boolean isCrashed() {
        return crashed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return crashed == car.crashed && Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, crashed);
    }
}
