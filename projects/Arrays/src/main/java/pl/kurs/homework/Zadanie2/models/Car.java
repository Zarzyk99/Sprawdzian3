package pl.kurs.homework.Zadanie2.models;

public class Car {
    private String producer;
    private String model;
    private String color;
    private int yearOfProduction;

    public Car(String producer, String model, String color, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }



    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
