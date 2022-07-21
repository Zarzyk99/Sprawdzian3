package pl.kurs.Zadanie1;

public class Car {
    private String producer;
    private String model;
    private boolean isMoving;
    private boolean openRoof;

    public Car() {
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(String producer, String model, boolean carInMotion, boolean openRoof) {
        this.producer = producer;
        this.model = model;
        this.isMoving = carInMotion;
        this.openRoof = openRoof;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        this.isMoving = moving;
    }

    public boolean isOpenRoof() {
        return openRoof;
    }

    public void setOpenRoof(boolean openRoof) {
        this.openRoof = openRoof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", carInMotion=" + isMoving +
                ", openRoof=" + openRoof +
                '}';
    }
}
