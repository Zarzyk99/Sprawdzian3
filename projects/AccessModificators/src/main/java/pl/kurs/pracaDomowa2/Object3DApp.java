package pl.kurs.pracaDomowa2;

import pl.kurs.pracaDomowa.Object3D;

public class Object3DApp {
    public static void main(String[] args) {
        Object3D point = new Object3D(2, 4, 5);
        point.printPointCoordinates();
        ObjectController objectController = new ObjectController(point);
        objectController.increaseA();
        System.out.println(point.getA());
        point.printPointCoordinates();
        objectController.decreaseB();
        point.printPointCoordinates();
        objectController.increaseC();
        objectController.decreaseB();
        objectController.decreaseB();
        point.printPointCoordinates();
        objectController.decreaseC();
        objectController.increaseB();
        objectController.increaseC();
        objectController.decreaseA();
        objectController.increaseB();
        objectController.increaseB();
        objectController.increaseB();
        objectController.increaseB();
        point.printPointCoordinates();
        objectController.resetAll();
        point.printPointCoordinates();
        objectController.resetToDefault();
        point.printPointCoordinates();


        System.out.println(point);


    }
}
