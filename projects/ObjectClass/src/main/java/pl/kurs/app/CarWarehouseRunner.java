package pl.kurs.app;

import pl.kurs.model.Car;
import pl.kurs.service.CarWarehouse;

public class CarWarehouseRunner {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "RS3");
        Car mercedes = new Car("Mercedes", "A45 AMG");
        Car bmw = new Car("BMW", "M3");
        Car vw = new Car("Volkswagen", "Golf R");
        CarWarehouse carWarehouse = new CarWarehouse(6);
        carWarehouse.addCar(audi);
        carWarehouse.addCar(audi);
        carWarehouse.addCar(mercedes);
        carWarehouse.addCar(bmw);
        carWarehouse.addCar(vw);
        carWarehouse.addCar(vw);
        System.out.println("-------------------------");
        carWarehouse.infoOfStorage(new Car("Volkswagen", "Golf R"));




        Car[] carsArrayInfo = carWarehouse.getCars();
        carsArrayInfo[0].setModel("Niva");
        carsArrayInfo[0].setProducer("Lada");

    }
}
