package pl.kurs.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        int[] table = {5, 10, 7, 3};
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
        Programmer programmer1 = new Programmer("Krzysztof", "Grzybek",
                10_000.0D, "Java");
        Programmer programmer2 = new Programmer("Adam", "Grzybek",
                10_000.0D, "Java");
        Programmer programmer3 = new Programmer("Adam", "Wysieński",
                10_000.0D, "Java");
        Programmer programmer4 = new Programmer("Adam", "Wysieński",
                10_000.0D, "Python");
        Programmer programmer5 = new Programmer("Adam", "Wysieński",
                15_000.0D, "C");
        Programmer programmer6 = new Programmer("Adam", "Wysieński",
                20_000.0D, "C");

        Programmer[] programmers = {programmer1, programmer2, programmer3, programmer4, programmer5, programmer6};
        Arrays.sort(programmers, new Comparator<Programmer>() {
            @Override
            public int compare(Programmer o1, Programmer o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }



    }
}
