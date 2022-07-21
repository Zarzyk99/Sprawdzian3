package pl.kurs.homework2;

import java.util.Comparator;

public class ProcessorComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int result = c1.getProcessor().getProducer().compareTo(c2.getProcessor().getProducer());
        if (result == 0)
            result = c2.getProcessor().getModel().compareTo(c1.getProcessor().getModel());
        if (result == 0)
            result = Double.compare(c2.getProcessor().getTiming(), c1.getProcessor().getTiming());
        if (result == 0)
            result = Integer.compare(c1.getProcessor().getQuantityOfCores(), c2.getProcessor().getQuantityOfCores());
        if (result == 0)
            result = Integer.compare(c1.getProcessor().getProcessorGeneration(), c2.getProcessor().getProcessorGeneration());
        if (result == 0)
            result = Integer.compare(c1.getProcessor().getTechnologicalProcessInNm(), c2.getProcessor().getTechnologicalProcessInNm());
        return result;
    }


}
