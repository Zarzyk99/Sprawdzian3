package pl.kurs.homework2;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int result = Integer.compare(c1.getRam().getSizeInGb(), c2.getRam().getSizeInGb());
        if (result == 0)
            result = Integer.compare(c1.getRam().getFrequencyInMHz(), c2.getRam().getFrequencyInMHz());
        if (result == 0)
            result = c1.getRam().getTypeOfDDR().compareTo(c2.getRam().getTypeOfDDR());
        if (result == 0)
            result = c1.getRam().getProducer().compareTo(c2.getRam().getProducer());
        if (result == 0)
            result = c1.getRam().getModel().compareTo(c2.getRam().getModel());
        return result;
    }
 
}
