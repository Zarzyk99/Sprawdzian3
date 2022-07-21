package pl.kurs.methodreferences;

import pl.kurs.supplier.Employee;

import java.util.ArrayList;
import java.util.List;

public class Office {
    public static final int MINIMUM_YEARS_EXPERIENCE = 4;

    private List<Employee> employees;

    public Office() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void hireEmployee(Employee candidate, double salary) {
        if(candidate == null) {
            throw new IllegalArgumentException("Kandydat nie może być nullem!");
        }
        candidate.setSalary(salary);
        employees.add(candidate);
        System.out.println(candidate + " został zatrudniony!");
    }

    public static boolean meetsRequiredExperience(Employee candidate) {
        if(candidate == null) {
            throw new IllegalArgumentException("Kandydat nie może być nullem!");
        }
        return candidate.getYearsOfExperience() >= MINIMUM_YEARS_EXPERIENCE;
    }



}
