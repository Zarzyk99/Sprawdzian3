package pl.kurs.pracaDomowa2;

import pl.kurs.pracaDomowa.Object3D;

public class ObjectController {
    private Object3D object3D;
    private int defaultA;
    private int defaultB;
    private int defaultC;


    public ObjectController(Object3D object3D) {
        this.object3D = object3D;
        this.defaultA = object3D.getA();
        this.defaultB = object3D.getB();
        this.defaultC = object3D.getC();
    }

    void increaseA() {
        object3D.setA(object3D.getA() + 1);
    }

    void decreaseA() {
        object3D.setA(object3D.getA() - 1);
    }

    void increaseB() {
        object3D.setB(object3D.getB() + 1);
    }

    void decreaseB() {
        object3D.setB(object3D.getB() - 1);
    }

    void increaseC() {
        object3D.setC(object3D.getC() + 1);
    }

    void decreaseC() {
        object3D.setC(object3D.getC() - 1);
    }

    void resetAll() {
        object3D.setA(0);
        object3D.setB(0);
        object3D.setC(0);
    }

    void resetToDefault() {
        object3D.setA(defaultA);
        object3D.setB(defaultB);
        object3D.setC(defaultC);
    }

}
