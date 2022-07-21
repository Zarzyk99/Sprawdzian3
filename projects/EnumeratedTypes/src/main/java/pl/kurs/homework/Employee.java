package pl.kurs.homework;

import java.util.Arrays;

public class Employee {
    private String name;
    private String lastName;
    private JobPosition jobPosition;
    private Salary salary;
    private Achievements[] achievements;

    public Employee(String name, String lastName, JobPosition jobPosition, Salary salary, Achievements... achievements) {
        this.name = name;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.salary = salary;
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobPosition=" + jobPosition +
                ", salary=" + salary +
                ", achievements=" + Arrays.toString(achievements) +
                '}';
    }
}
