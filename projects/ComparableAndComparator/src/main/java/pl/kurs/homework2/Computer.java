package pl.kurs.homework2;

public class Computer {
    private MotherBoard motherboard;
    private Processor processor;
    private HardDrive hardDrive;
    private Ram ram;
    private GraphicCard graphicCard;

    public Computer(MotherBoard motherboard, Processor processor, HardDrive hardDrive, Ram ram, GraphicCard graphicCard) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.graphicCard = graphicCard;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Ram getRam() {
        return ram;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard=" + motherboard +
                ", processor=" + processor +
                ", hardDrive=" + hardDrive +
                ", ram=" + ram +
                ", graphicCard=" + graphicCard +
                '}';
    }
}
