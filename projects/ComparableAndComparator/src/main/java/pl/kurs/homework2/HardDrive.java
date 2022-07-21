package pl.kurs.homework2;

public class HardDrive {
    private TypeOfDisk typeOfDisk;
    private double capacityInTb;
    private String producer;
    private String model;

    public HardDrive(TypeOfDisk typeOfDisk, double capacity, String producer, String model) {
        this.typeOfDisk = typeOfDisk;
        this.capacityInTb = capacity;
        this.producer = producer;
        this.model = model;
    }

    public TypeOfDisk getTypeOfDisk() {
        return typeOfDisk;
    }

    public double getCapacityInTb() {
        return capacityInTb;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "typeOfDisk=" + typeOfDisk +
                ", capacity=" + capacityInTb +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
