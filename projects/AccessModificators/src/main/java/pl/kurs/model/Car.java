package pl.kurs.model;

import java.io.Serializable;

public class Car implements Serializable { //standard Java Beans
    //private static final long serialVersionUID = 4345675756657564562L;

    private String producer;
    private String model;
    private String color;
    private String vin;
    private int year;

    public Car() {
    }

    public Car(String producer, String model, String color, String vin) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.vin = vin;
    }

    public Car(String producer, String model, String color, String vin, int year) {
        this(producer, model, color, vin);
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarInfo() {
        return color + ' ' + producer + ' ' + model + ' ' + vin + ' ' + year;
    }

    public void printCarInfo() {
        System.out.println(getCarInfo());
    }


}
