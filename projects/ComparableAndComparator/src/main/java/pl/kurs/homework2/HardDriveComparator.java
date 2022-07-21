package pl.kurs.homework2;

import java.util.Comparator;

public class HardDriveComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int result = c1.getHardDrive().getTypeOfDisk().compareTo(c2.getHardDrive().getTypeOfDisk());
        if (result == 0)
            result = Double.compare(c1.getHardDrive().getCapacityInTb(), c2.getHardDrive().getCapacityInTb());
        if (result == 0)
            result = c1.getHardDrive().getProducer().compareTo(c2.getHardDrive().getProducer());
        if (result == 0)
            result = c1.getHardDrive().getModel().compareTo(c2.getHardDrive().getModel());
        return result;
    }

}
