package pl.kurs.homework2;

public class Ram {
    private int sizeInGb;
    private int frequencyInMHz;
    private TypeOfDDR typeOfDDR;
    private String producer;
    private String model;

    public Ram(int sizeInGB, int frequencyInMHz, TypeOfDDR typeOfDDR, String producer, String model) {
        this.sizeInGb = sizeInGB;
        this.frequencyInMHz = frequencyInMHz;
        this.typeOfDDR = typeOfDDR;
        this.producer = producer;
        this.model = model;
    }

    public int getSizeInGb() {
        return sizeInGb;
    }

    public int getFrequencyInMHz() {
        return frequencyInMHz;
    }

    public TypeOfDDR getTypeOfDDR() {
        return typeOfDDR;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "sizeInGB=" + sizeInGb +
                ", frequencyInMHz=" + frequencyInMHz +
                ", typeOfDDR=" + typeOfDDR +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
