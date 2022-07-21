package pl.kurs.comparator;

public class Car {
    private String producer;
    private String model;
    private char modelCode;
    private int powerInHP;
    private int torqueInNm;
    private int vMaxInKPH;

    public Car(String producer, String model, char modelCode, int powerInHP, int torqueInNm, int vMaxInKPH) {
        this.producer = producer;
        this.model = model;
        this.modelCode = modelCode;
        this.powerInHP = powerInHP;
        this.torqueInNm = torqueInNm;
        this.vMaxInKPH = vMaxInKPH;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public char getModelCode() {
        return modelCode;
    }

    public int getPowerInHP() {
        return powerInHP;
    }

    public int getTorqueInNm() {
        return torqueInNm;
    }

    public int getvMaxInKPH() {
        return vMaxInKPH;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", modelCode=" + modelCode +
                ", powerInHP=" + powerInHP +
                ", torqueInNm=" + torqueInNm +
                ", vMaxInKPH=" + vMaxInKPH +
                '}';
    }
}
