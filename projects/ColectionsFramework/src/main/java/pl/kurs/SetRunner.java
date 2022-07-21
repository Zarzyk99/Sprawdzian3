package pl.kurs;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        //HashSet – Najprostsza implementacja interfejsu Set. Wykorzystuje mechanizm hashCode() (dlatego wymaga implementacji equlas() i hashcode() od typu,
        // który będzie przechowywany), przechowuje unikalne elementy (ignoruje dodanie identycznego elementu),
        // umożliwia dodawanie nullów, nie zachowuje kolejności dodawania oraz nie jest bezpieczna wielowątkowo:
//
//        Zalety: zezwala na dodawanie nulla oraz zawiera unikalne obiekty.
//        Wady: nie zachowuje kolejności dodawanych elementów.
//                Metody HashSeta (podstawowe):
//•	add(E e) – dodaje element do zbioru, przy próbie dodania duplikatu argument metody zostanie zignorowany;
//•	contains(E e) – sprawdza, czy zbiór zawiera dany element;
//•	remove(E e) – usuwa ze zbioru dany element;
//•	size() – zwraca ilość elementów przechowywaną w zbiorze;

//        Set<Integer> integerSet = new HashSet<>();
//        integerSet.add(3);
//        integerSet.add(2);
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(null);
//        for (Integer integer : integerSet) {
//            System.out.println(integer);
//        }

        Car car1 = new Car("BMW", "E60", 315);
        Car car2 = new Car("Audi", "A3", 230);
        Car car3 = new Car("Mercedes", "W124", 150);
//        Set<Car> carSet = new HashSet<>();
//        carSet.add(car1);
//        carSet.add(car2);
//        carSet.add(car3);
//
//        for (Car car : carSet) {
//            System.out.println(car);
//        }
        //LinkedHashSet
        //LinkedHashSet – zbiór niemal identyczny jak HashSet, dzięki wewnętrznej reprezentacji w postaci listy wiązanej,
        // kolejność dodawanych elementów jest zapamiętywana:
        //Zalety:  zachowuje kolejność dodawanych elementów, wysoka wydajność dodawania oraz usuwania elementów.
        //Wady: większa ilość wykorzystywanej pamięci ponieważ LinkedHashSet wykorzystuje LinkedList wraz z HashMap do przechowywania swoich elementów.

//
//        Set<Integer> integerSet2 = new LinkedHashSet<>();
//        integerSet2.add(2);
//        integerSet2.add(3);
//        integerSet2.add(1);
//        integerSet2.add(null);
//        for (Integer integer : integerSet2) {
//            System.out.println(integer);
//        }


        //TreeSet
        //TreeSet – zbiór, który charakteryzuje się, tym, że dodawane do niego element są ustawiane w swoim naturalnym porządku
        // (typ danych musi implementować Comparable) lub porządku zdefiniowanym przez przekazany komparator. Nie jest bezpieczny wielowątkowo:
        //Dodatkowe metody w TreeSet:
        //•	first() / last() – zwraca pierwszy/ostatni element zbioru.

        SortedSet<String> stringSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        stringSet.add("cytryny");
        stringSet.add("arbuzy");
        stringSet.add("banany");

        System.out.println(stringSet);
        System.out.println(stringSet.first());

        SortedSet<Car> carSortedSet = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });
        carSortedSet.add(car1);
        carSortedSet.add(car2);
        carSortedSet.add(car3);
        carSortedSet.add(new Car("Opel", "Kadett", 150));
        for (Car car : carSortedSet) {
            System.out.println(car);
        }

        //Szybkie Sety
        Set<Integer> integers = Set.of(1, 3, 4, 2, 6);//nie można dodawać nulla
        System.out.println(integers);
//        integers.add(21); rzuca UnsupportedOperationException



    }
}
