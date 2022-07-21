package pl.kurs.homework2;

import java.util.Comparator;

public class MotherBoardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int result = c1.getMotherboard().getTypeOfSocket().compareTo(c2.getMotherboard().getTypeOfSocket());
        if (result == 0)
            result = c1.getMotherboard().getProducer().compareTo(c2.getMotherboard().getProducer());
        if (result == 0)
            result = c1.getMotherboard().getModel().compareTo(c2.getMotherboard().getModel());
        return result;
    }

}
