package pl.kurs;

import java.io.Serializable;

public class Car extends Vehicle {
    private String producer;
    private String model;
    private int yearProduction;

    public Car(String producer, String model, int yearProduction) {
        this.producer = producer;
        this.model = model;
        this.yearProduction = yearProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                '}';
    }
}
