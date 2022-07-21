package pl.kurs.zadanie5;

import java.util.List;

public class Employee extends Person {

    public Employee(String firstName, String lastName, long pesel, List<Income> incomes) {
        super(firstName, lastName, pesel, incomes);
    }
}
