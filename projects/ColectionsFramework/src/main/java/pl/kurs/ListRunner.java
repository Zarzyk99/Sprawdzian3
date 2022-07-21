package pl.kurs;

import java.util.*;

public class ListRunner {
    public static void main(String[] args) {
        //ArrayList
//        ArrayList (lista tablicowa) – dynamiczna tablica, która odpowiednio zwiększa swój rozmiar. Domyślny rozmiar początkowy to 10.
//        Zalety: dostęp do losowych danych z ArrayListy jest bardzo szybki, jak również szybkie jest wstawianie elementu na koniec listy
//        czyli pierwsze wolne miejsce.
//        Wady: niska wydajność w przypadku wstawiania lub usuwania elementów w środku tablicy, ponieważ wiąże się to z przesuwaniem sporej
//        ilości elementów leżących „na prawo”.
// ---------------------------------------------------------------------------------------------
//        Metody Listy:
//•	add(E e) – dodaje element;
//•	addAll(Collection c) – dodaje wszystkie element ze wskazanej kolekcji;
//•	clear() – usuwa wszystkie elementy z listy;
//•	get(int index) – zwraca element spod danego indeksu;
//•	remove(int index) – usuwa element spod danego indeksu;
//•	remove(Object o) – usuwa pierwsze wstąpienie obiektu, dla którego porównanie equals() z tym z argumentu zwróci true;
//•	sort(Comparator c) – sortuje listę zgodnie z przekazanym komparatorem;
//•	size() zwraca ilość elementów listy;
//domyślny rozmiar 10

//        List<Integer> integers = new ArrayList<>(100_000);
//        integers.add(2);//zwraca booleana
//        integers.add(666);
//        integers.add(-40);
//        integers.add(0);
//        integers.add(null);
//        integers.add(1);
//        System.out.println(integers);
//        integers.add(1,40);
//        System.out.println(integers);
//        System.out.println(integers.get(2));
//        integers.remove(2);
//        System.out.println(integers);
//        integers.remove(Integer.valueOf(1));
//        System.out.println(integers);
//        System.out.println(integers.size());

        //LinkedList
//LinkedList (lista podwójnie wiązana) – nie wykorzystuje wewnątrz tablicy, lecz wspomaga się obiektami dodatkowej klasy wewnętrzej,
// tzw: NODE’ami czyli węzłami, które wskazują na poprzednika i następnika znajdującego się na liście. Czyli element zawiera trzy referencje – na obiekt właściwy,
// na poprzednika i na następnika.
//Zalety: szybkie wstawianie i usuwanie elementów ponieważ aktualizowane są tylko informacje o następnikach i poprzednikach odpowiednich elementów
// (nie ma potrzeby przesuwania całego zbioru danych).
//Wady: dostęp do losowych danych z listy jest bardzo wolny, ponieważ trzeba iterować po kolei po obiektach. Jeżeli obiekt jest w pierwszej połowie
// to iteracja następuje od początku, jeżeli w drugiej połowie to iteracja następuje od końca.
//
//        LinkedList<Integer> integers2 = new LinkedList<>();
//        integers2.add(2);//zwraca boolea
//        integers2.add(666);
//        integers2.add(-40);
//        integers2.add(0);
//        integers2.add(null);
//        integers2.add(1);
//        System.out.println(integers2);
//        integers2.add(1,40);
//        System.out.println(integers2);
//        System.out.println(integers2.get(2));
//        integers2.remove(2);
//        System.out.println(integers2);
//        integers2.remove(Integer.valueOf(1));
//        System.out.println(integers2);
////        System.out.println(integers2.size());
//        integers2.removeLast();
//        integers2.addFirst(201);
//        System.out.println(integers2);


//        Metody Są te same co w ArrayLiscie, dodatkowo:
//•	addFirst() / removeFirst() – dodanie i usunięcie elementu z początku listy;
//•	addLast() / removeLast() - dodanie i usunięcie elementu z końca listy;


        Random random = new Random();
        System.out.println(random.nextInt((6)) + 10);  //(gówny zakres powiększony o 1 - dolny zakres) + dolny zakres
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt((6)) + 10);
        }
        System.out.println(integerList);



        //Szybkie listy
        List<String> strings = List.of("12", "dypa", "asdasd"); //nie mozna przekazać nullów
        System.out.println(strings);
        //strings.add("heheski");


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, null); //mozna przekazywac nulle
        System.out.println(integers);
//        integers.add(666);



    }
}
