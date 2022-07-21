package pl.kurs.service;

import pl.kurs.model.Car;

public class CarFactory {

   private String factoryName;

   public static Car buildBrandNewCar(String producer, String model, String color, String vin){

      Car vehicle = new Car();
      vehicle.setProducer(producer);
      vehicle.setModel(model);
      vehicle.setColor(color);
      vehicle.setVin(vin);

      //System.out.println("Auto zostało wyprodukowane przez: " + factoryName); //metoda instancji może korzystać ze stanu klasy
      return vehicle;
   }
}
