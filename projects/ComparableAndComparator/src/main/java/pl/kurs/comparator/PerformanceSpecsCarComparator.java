package pl.kurs.comparator;

import java.util.Comparator;

public class PerformanceSpecsCarComparator implements Comparator<Car> {

    //Zasady:
    //•	w pierwszej kolejności porównywanie po mocy auta – od największej do najmniejszej;
    //•	jeżeli moce są takie same to porównywanie po momencie obrotowym – od najwyższego do najniższego;
    //•	jeżeli z kolei wartości momentów obrotowych są takie same to porównujemy po prędkości maksymalnej auta – od największej do najmniejszej;
    @Override
    public int compare(Car c1, Car c2) {
        int result = Integer.compare(c2.getPowerInHP(), c1.getPowerInHP());
        if (result == 0)
            result = Integer.compare(c2.getTorqueInNm(), c1.getTorqueInNm());
        if(result == 0)
            result = Integer.compare(c2.getvMaxInKPH(), c1.getvMaxInKPH());
        return result;
    }
}
