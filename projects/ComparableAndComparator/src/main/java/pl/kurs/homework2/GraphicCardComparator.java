package pl.kurs.homework2;

import java.util.Comparator;

public class GraphicCardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int result = Double.compare(c1.getGraphicCard().getRailSizeInMBit(), c2.getGraphicCard().getRailSizeInMBit());
        if (result == 0)
            result = Integer.compare(c1.getGraphicCard().getQuantityOfMemoryInGB(), c2.getGraphicCard().getQuantityOfMemoryInGB());
        if (result == 0)
            result = c1.getGraphicCard().getModel().compareTo(c2.getGraphicCard().getModel());
        if (result == 0)
            result = c1.getGraphicCard().getProducer().compareTo(c2.getGraphicCard().getProducer());
        return result;
    }

}
