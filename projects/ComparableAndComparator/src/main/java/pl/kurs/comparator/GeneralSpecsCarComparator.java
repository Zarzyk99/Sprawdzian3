package pl.kurs.comparator;

import java.util.Comparator;

public class GeneralSpecsCarComparator implements Comparator<Car> {


    //Zasady porównywania:
    //•	w pierwszej kolejności sortujemy po producencie alfabetycznie;
    //•	kiedy producenci są ci sami to sortujemy po modelu alfabetycznie;
    //•	kiedy z kolei modele są te same to sortujemy po kodzie modelu odwrotnie do kolejności alfabetycznej;
    @Override
    public int compare(Car c1, Car c2) {
        int result = c1.getProducer().compareTo(c2.getProducer());
        if( result == 0)
            result = c1.getModel().compareTo(c2.getModel());
        if (result == 0)
            result = Character.compare(c2.getModelCode(), c1.getModelCode());
        return result;
    }
}
