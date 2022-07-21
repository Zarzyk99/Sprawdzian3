package pl.kurs.model;

import java.util.Objects;

public class Car {
    private String producer;
    private String model;

    public Car() {
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Car(Car car) { //konstruktor klonujący
        this.producer = car.producer;
        this.model = car.model;
    }

    public static Car copyCar(Car car){// fabryczna metoda klonująca
        return new Car(car.producer, car.model);
    }
}
