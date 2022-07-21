package pl.kurs.homework2;

public class Processor {
    private String producer;
    private String model;
    private double timing;
    private int quantityOfCores;
    private int processorGeneration;
    private int technologicalProcessInNm;

    public Processor(String producer, String model, double timing, int quantityOfCores, int processorGeneration, int technologicalProcess) {
        this.producer = producer;
        this.model = model;
        this.timing = timing;
        this.quantityOfCores = quantityOfCores;
        this.processorGeneration = processorGeneration;
        this.technologicalProcessInNm = technologicalProcess;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public double getTiming() {
        return timing;
    }

    public int getQuantityOfCores() {
        return quantityOfCores;
    }

    public int getProcessorGeneration() {
        return processorGeneration;
    }

    public int getTechnologicalProcessInNm() {
        return technologicalProcessInNm;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", timing=" + timing +
                ", quantityOfCores=" + quantityOfCores +
                ", processorGeneration=" + processorGeneration +
                ", technologicalProcess=" + technologicalProcessInNm +
                '}';
    }
}
