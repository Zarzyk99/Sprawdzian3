package pl.kurs.homework2;

import java.util.Arrays;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1 = new Computer(new MotherBoard(TypeOfSocket.AM4, "ASrock", "Phantom Gaming 4"), new Processor("AMD", "Ryzen 5 5600X", 4.6, 6, 5, 7), new HardDrive(TypeOfDisk.HDD, 10, "Seagate", "Enterprise Capacity"), new Ram(16, 3200, TypeOfDDR.DDR4, "Kingston", "FURY Beast RGB"), new GraphicCard(0.000183, 6, "GeForce GTX 1660", "Gigabyte"));
        Computer computer2 = new Computer(new MotherBoard(TypeOfSocket.STRX4, "Gigabyte", "B450 AorusPro"), new Processor("Intel", "Core i5", 4.5, 6, 5, 14), new HardDrive(TypeOfDisk.SSD, 1, "Samsung", "870 QVO"), new Ram(16, 3200, TypeOfDDR.DDR4, "Kingston", "FURy Beast RGB"), new GraphicCard(0.000061, 4, "RX 6500 XT", "AMD Radeon"));
        Computer computer3 = new Computer(new MotherBoard(TypeOfSocket.TR4, "Gigabyte", "Z690"), new Processor("AMD", "Ryzen 7 5700G", 4.6, 8, 7, 7), new HardDrive(TypeOfDisk.SSD, 1, "Samsung", "980"), new Ram(16, 3600, TypeOfDDR.DDR4, "Patriot", "Viper 4"), new GraphicCard(0.000183, 6, "GeForce GTX 1660 Ti", "Gainward"));
        Computer computer4 = new Computer(new MotherBoard(TypeOfSocket.TR4, "MSI", "Z590"), new Processor("Intel", "Core i5", 4.9, 6, 5, 14), new HardDrive(TypeOfDisk.HDD, 8, "WD", "Purple Pro"), new Ram(16, 3200, TypeOfDDR.DDR3, "Patriot", "Viper 4"), new GraphicCard(0.000244, 16, "RX 6900 XT ", "Radeon"));
        Computer computer5 = new Computer(new MotherBoard(TypeOfSocket.STRX4, "Gigabyte", "B450 AorusPro"), new Processor("AMD", "Ryzen 5 5600X", 4.6, 6, 5, 7), new HardDrive(TypeOfDisk.SSD, 0.5, "Samsung", "870 QVO"), new Ram(16, 3600, TypeOfDDR.DDR4, "Patriot", "Viper 4"), new GraphicCard(0.000183, 6, "GeForce GTX 1660", "Gigabyte"));
        Computer computer6 = new Computer(new MotherBoard(TypeOfSocket.AM4, "ASrock", "Z690 PG Riptide"), new Processor("Intel", "Core i7", 5.0, 8, 7, 14), new HardDrive(TypeOfDisk.SSD, 0.5, "Curcial", "MX500"), new Ram(16, 3200, TypeOfDDR.DDR3, "T-Force", "Night Hawk RGB"), new GraphicCard(0.000122, 16, "RX 6600 XT", "Radeon"));
        Computer[] computers = {computer1, computer2, computer3, computer4, computer5, computer6};
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("--------------------------------");
        Arrays.sort(computers, new RamComparator());
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("--------------------------------");
        Arrays.sort(computers, new GraphicCardComparator());
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        System.out.println("--------------------------------");
        Arrays.sort(computers, new ProcessorComparator());
        for (Computer computer : computers) {
            System.out.println(computer);
        }


        
    }
}
