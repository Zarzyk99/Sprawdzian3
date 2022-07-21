package pl.kurs.homework2;

public class GraphicCard {
    private double railSizeInMBit;
    private int quantityOfMemoryInGB;
    private String model;
    private String producer;

    public GraphicCard(double railSizeInMBit, int quantityOfMemory, String model, String producer) {
        this.railSizeInMBit = railSizeInMBit;
        this.quantityOfMemoryInGB = quantityOfMemory;
        this.model = model;
        this.producer = producer;
    }

    public double getRailSizeInMBit() {
        return railSizeInMBit;
    }

    public int getQuantityOfMemoryInGB() {
        return quantityOfMemoryInGB;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "railSizeInMBit=" + railSizeInMBit +
                ", quantityOfMemory=" + quantityOfMemoryInGB +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
