package pl.kurs;

import java.util.*;

public class CollectionsRunner {
    //•	binarySearch() - w posortowanej liście wyszukuje element podany jako drugi argument,
    //•	copy() - pozwala skopiować wszystkie elementy jednej listy do innej,
    //•	fill() - podmienia wszystkie elementy podanej listy obiektem przekazanym jako drugi argument,
    //•	frequency() - zlicza liczbę wystąpień w kolekcji danego obiektu,
    //•	min() / max() - zwraca najmniejszą lub największą wartość w kolekcji (zgodnie z naturalnym porządkiem lub przekazanym komparatorem),
    //•	reverse() - odwraca kolejność elementów w liście,
    //•	shuffle() - miesza elementy w liście,
    //•	swap() - zamienia miejscami dwa elementy w liście.
    //•	sort() – sortuje kolekcję wg. naturalnej kolejności.

    public static void main(String[] args) {

        List<String> randomWords = new ArrayList<>();
        randomWords.add("Rower");
        randomWords.add("Motocykl");
        randomWords.add("Samochód");
        randomWords.add("Samolot");
        randomWords.add("Szybowiec");
        randomWords.add("Motocykl");

        System.out.println(randomWords);

        //metoda sort()
        Collections.sort(randomWords);
        System.out.println(randomWords);

        //metoda binarySearch()
        int searchedIndex = Collections.binarySearch(randomWords, "Motocykl");
        System.out.println(searchedIndex);

        //metoda shuffle()
        Collections.shuffle(randomWords);
        System.out.println(randomWords);

        //metoda frequency()
        int frequency = Collections.frequency(randomWords, "Motocykl");
        System.out.println(frequency);

        //metoda min() i max()
        String min = Collections.min(randomWords);
        System.out.println(min);
        String max = Collections.max(randomWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(max);

        System.out.println("-------------------");
        //swap()
        Collections.sort(randomWords);
        System.out.println(randomWords);
        Collections.swap(randomWords, 0, 5);
        System.out.println(randomWords);

        //metoda fill()
        Collections.fill(randomWords, "Hulajnoga");
        System.out.println(randomWords);

        //metoda copy()
        List<String> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(null);
        list2.add(null);
        list2.add(null);
        list2.add(null);
        list2.add(null);
        list2.add(null);

        Collections.copy(list2, randomWords);
        System.out.println(list2);

        //programowanie funkcyjne iterfejsy funkcyjne i wyrażenia lambda

    }
}
