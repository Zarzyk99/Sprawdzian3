package pl.kurs.zadanie4;

import pl.kurs.zadanie5.*;

import java.util.List;


public class MinMaxRunner {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 20, 3, 4, 5, 32, 76, 8);
        List<String> strings = List.of("pies", "kot", "słoń", "małpa", "kangur", "wieloryb", "abstynent");

        List<Person> personList = List.of(
                new Student("Jacek", "Blaszka", 98032784278l, List.of(new ScholarshipIncome(423.54))),
                new Employee("Janusz", "Tracz", 86104275694l, List.of(new WorkIncome(5432.32))),
                new Student("Dariusz", "Grzybek", 95021004398l, List.of(new WorkIncome(3742.56), new ScholarshipIncome(410.78)))
        );

        System.out.println(MinMaxService.getMinAndMax(integers));
        System.out.println(MinMaxService.getMinAndMax(strings));
        System.out.println(MinMaxService.getMinAndMax(personList));

    }
}
