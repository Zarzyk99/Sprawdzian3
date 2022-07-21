package pl.kurs;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {
        //HashMap – (nie jest synchronizowana), przechowuje elementy w sposób nieposortowany oraz w przypadkowej kolejności.
        // Do elementów odwołujemy się po kluczach. Do poprawnego działania wymaga zaimplementowania przez przechowywany typ danych metody hashcode() oraz equals().
        // HashMapa może przechowywać jeden klucz null oraz wiele wartości null, ale z unikalnymi kluczami.
        //Zalety: Szybki dostęp do kluczy-wartości dzięki haszowaniu.
        //Wady: Potencjalna kolizja kiedy dwa różne klucze wygenerują ten sam hashcode (pogorszona wydajność wtedy).
        // Okazjonalnie HashMapa potrzebuje zwiększyć swój rozmiar, kiedy koszyki są pełne.

        //Metody Mapy (podstawowe):
        //•	put(K key, V value) – wstawia element value pod kluczem key;
        //•	get(K key) – zwraca element znajdujący się pod wskazanym kluczem;
        //•	keySet() – zwraca zbiór wszystkich kluczy;
        //•	values() – zwraca kolekcję wszystkich elementów przechowywanych;
        //•	remove(Object key) – usuwa element należący do wskazanego klucza;
        //•	entrySet() – zwraca zbiór obiektów w formie klucz=wartość (w postaci Map.Entry<K, V>);
        //•	clear() – usuwa wszystkie elementy z mapy;

        Map<String, String> capitalCountry = new HashMap<>();
        capitalCountry.put("Warszawa", "Polska");
        capitalCountry.put("Praga", "Czechy");
        capitalCountry.put("Berlin", "Niemcy");
        capitalCountry.put("Berlin", "III Rzesza");
        capitalCountry.put(null, "Antyczne Ateny");
        capitalCountry.put(null, "Jerycho");

        Set<Map.Entry<String, String>> entrySet = capitalCountry.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry);
        }

        Set<String> stringSet = capitalCountry.keySet();
        System.out.println(stringSet);

        Collection<String> values = capitalCountry.values();
        System.out.println(values);


        //LinkedHashMap
        //Zalety: zachowana kolejność dodawania, szybka iteracja.
        //Wady: wolniejsze niż w HashMapie dodawanie i usuwanie elementów.
        Map<String, Integer> disciplinePlayersNumber = new LinkedHashMap<>();
        disciplinePlayersNumber.put("Soccer", 11);
        disciplinePlayersNumber.put("Basketball", 5);
        disciplinePlayersNumber.put("Rugby", 7);
        System.out.println(disciplinePlayersNumber);

        //TreeMap
        //– obiekty dodawanie do TreeMap są sortowane zgodnie z naturalnym porządkiem kluczy lub zgodnie z komparatorem przekazanym w konstruktorze TreeMapy:


        Map<Integer,String> numberWord = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        numberWord.put(2, "two");
        numberWord.put(6, "six");
        numberWord.put(4, "four");
        numberWord.put(40, null);
        System.out.println(numberWord);


        //HashTable
        //starsza wersja hashMap
        //nie może przechowywać nullowych kluczy i wartośći

        Map<Integer, Integer> hashTable = new Hashtable<>();
//        hashTable.put(null, 1);
//        hashTable.put(1, null);



        Map<String, Integer> carsAndPowers = Map.of(
                "Ferrari", 660,
                "McLaren", 720,
                "Corvette", 750
        );



        System.out.println(carsAndPowers);
        //carsAndPowers.put("Fiat", 60);


        Map<String, Integer> carsAndPowers2 = Map.ofEntries(
                Map.entry("Ferrari", 660),
                Map.entry("McLaren", 720),
                Map.entry("Corvette", 750),
                Map.entry(null, 750)
        );
        System.out.println(carsAndPowers2);
    }
}
