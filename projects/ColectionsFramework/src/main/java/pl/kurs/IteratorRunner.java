package pl.kurs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorRunner {
    public static void main(String[] args) {
        Set<String> fruitsSet = new LinkedHashSet<>();
        fruitsSet.add("Banany");
        fruitsSet.add("Arbuzy");
        fruitsSet.add("Cytryny");
        fruitsSet.add("Brzoskwinie");
        fruitsSet.add("Pomarańcze");
        fruitsSet.add("Maliny");

        Iterator<String> iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Cytryny")) {
                iterator.remove();
                if (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }
            }
        }

        System.out.println(fruitsSet);
        // następne zajęcia mapy



    }
}
