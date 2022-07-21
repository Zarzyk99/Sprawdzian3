package pl.kurs;

import java.util.Arrays;

public class PijackaMelina {
    public static void main(String[] args) {
        Patus p1 = new Patus("Zenek Gwałciciel", "Gwałty na zlecenie i bez zlecenia też");
        Patus p2 = new Patus("Karyna", "Z gumą 100 bez 50");
        Patus[] patusy = new Patus[10];
        patusy[0] = p1;
        patusy[1] = p2;
        System.out.println(Arrays.toString(patusy));
        System.out.println(patusy[0].getSpecjalizacja());
//        System.out.println(patusy[10]);

        System.out.println(patusy.length); // pokazuje rozmiar całej tablicy


    }
}
