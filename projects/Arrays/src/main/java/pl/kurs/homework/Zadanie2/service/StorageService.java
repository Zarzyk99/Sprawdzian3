package pl.kurs.homework.Zadanie2.service;

import pl.kurs.homework.Zadanie2.models.Car;

public class StorageService {
    private Car[] cars;
    private int lastAddedCarIndex;


    public StorageService(int capacity){
        this.lastAddedCarIndex = -1;
        cars = new Car[capacity];
    }

    public void addCar(Car car){
        if(car.getYearOfProduction() < 2010 && car.getColor().equals("biały")){
            System.out.println("Nie można dodać pojazdu ponieważ jest za stare i ma kolor biały ");
        } else if(car.getColor().equals("biały")) {
            System.out.println("Nie można dodać auta do magazynu ponieważ jest koloru białego.");
        } else if(car.getYearOfProduction() < 2010){
            System.out.println("Nie można dodać auta do magazynu ponieważ zostało wyprodukowane przed 2010 rokiem.");
        } else {
            cars[++lastAddedCarIndex] = car;
            System.out.println("Dodano nowe auto: " + car);
        }
    }
    public void deleteLastAddedCar(){
        if(lastAddedCarIndex < 0){
            System.out.println("Magazyn jest pusty.");
        } else {
            Car car = cars[lastAddedCarIndex];
            System.out.println("Usunięto z magazynu ostatnio dodane auto: " + car);
            cars[lastAddedCarIndex--] = null;
        }
    }
}
