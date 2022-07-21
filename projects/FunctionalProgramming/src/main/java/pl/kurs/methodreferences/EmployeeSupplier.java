package pl.kurs.methodreferences;

import pl.kurs.supplier.Employee;

@FunctionalInterface
public interface EmployeeSupplier {
    Employee get(String firstName, String lastName, int yearsExperience);

}
