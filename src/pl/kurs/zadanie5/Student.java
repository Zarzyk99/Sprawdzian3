package pl.kurs.zadanie5;

import java.util.List;

public class Student extends Person {


    public Student(String firstName, String lastName, long pesel, List<Income> incomes) {
        super(firstName, lastName, pesel, incomes);
    }
}
