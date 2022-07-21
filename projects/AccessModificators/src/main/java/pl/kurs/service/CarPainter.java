package pl.kurs.service;

import pl.kurs.model.Car;

public class CarPainter {

    private String name;
    public void setName(String name){
        this.name = name;
    }

    public void changeCarColor(String newColor, Car carForColorChange){
        carForColorChange.setColor(newColor);
    }
    public void  changeVin(String newVin, Car carForVinChange){
        carForVinChange.setVin(newVin);
    }
}
