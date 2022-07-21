package pl.kurs.homework.Zadanie2.app;

import pl.kurs.homework.Zadanie2.models.Car;
import pl.kurs.homework.Zadanie2.service.StorageService;

public class StorageServiceRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A6", "Nardo grey", 2016);
        Car car2 = new Car("Mercedes", "E klasa", "biały", 2002);
        Car car3 = new Car("Fiat", "126p", "czerwony", 1989);

        StorageService storageService = new StorageService(10);
        storageService.addCar(car1);
        storageService.addCar(car2);
        storageService.addCar(car3);
        storageService.deleteLastAddedCar();
        storageService.deleteLastAddedCar();
    }
}
