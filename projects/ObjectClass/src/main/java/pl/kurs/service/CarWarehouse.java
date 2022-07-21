package pl.kurs.service;

import pl.kurs.model.Car;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CarWarehouse {
    private Car[] cars;
    private int carIndex;

    public CarWarehouse(int capacity) {
        this.carIndex = -1;
        cars = new Car[capacity];
    }

    public void addCar(Car car) {
        if (car == null) {
            System.out.println("Nie można dodać nulla.");
        } else {
            if (cars.length == carIndex + 1) {
                System.out.println("Brak wolnych miejsc w magazynie");
            } else {
                cars[++carIndex] = car;
                System.out.println("Umieszczono nowe auto do magazynu " + car);
            }
        }
    }

    public void infoOfStorage(Car sampleCar) {
        int counter = 0;
        for (Car car : cars) {
            if (car.equals(sampleCar)) counter++;
        }
        System.out.println("Auto przekazane do wyszukiwania: " + sampleCar);
        System.out.println("Znaleziona ilość identycznych aut: " + counter);
    }


    public Car[] getCars() {//specjalny getter który nie łamie zasady hermetyzacji, ponieważ tworzy kopie tablicy z kopiami obiektów
        Car[] copiedArray = Arrays.copyOf(cars, cars.length);
        for (int i = 0; i < cars.length; i++) {
//            copiedArray[i] = new Car(cars[i]); wywowałnie konstruktora klonującego
            copiedArray[i] = Car.copyCar(cars[i]);//
        }
        return copiedArray;
    }
}
