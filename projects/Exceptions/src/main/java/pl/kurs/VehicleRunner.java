package pl.kurs;

import pl.kurs.exceptions.NoRecognizedOptionException;

public class VehicleRunner {
    public static void main(String[] args) {
        ElectricCar tesla = ElectricCar.create("Tesla", "Plaid", 12);
        System.out.println(tesla);


        tesla.drive100km();
        tesla.drive100km();
        System.out.println(tesla);
        tesla.recharge(10);
        System.out.println(tesla);



        try {
            ElectricCar myOrderedCar = ElectricVehicleFactory.createBrandNewCar("Ferrari");
            System.out.println(myOrderedCar);
        } catch (NoRecognizedOptionException e) {
            System.err.println(e.getMessage());
        }

    }
}
