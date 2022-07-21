package pl.kurs.homework2;

public class MotherBoard {
    private TypeOfSocket typeOfSocket;
    private String producer;
    private String model;


    public MotherBoard(TypeOfSocket typeOfSocket, String producer, String model) {
        this.typeOfSocket = typeOfSocket;
        this.producer = producer;
        this.model = model;
    }

    public TypeOfSocket getTypeOfSocket() {
        return typeOfSocket;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "typeOfSocket=" + typeOfSocket +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
