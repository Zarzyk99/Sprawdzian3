package pl.kurs;

import pl.kurs.exceptions.NoRecognizedOptionException;

public class ElectricVehicleFactory {
    public static ElectricCar createBrandNewCar(String chosenBrand) throws NoRecognizedOptionException {
        return switch (chosenBrand){
            case "Ferrari" -> ElectricCar.create("Ferrari", "SF90", 0);
            case "Porsche"-> ElectricCar.create("Porsche", "Tycan", 0);
            default -> throw new NoRecognizedOptionException("Nie rozpoznano " + chosenBrand);
        };

    }
}
