package pl.kurs.zadanie5;

import java.util.List;

public class PeopleRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Jacek", "Blaszka", 98032784278l, List.of(new ScholarshipIncome(423.54)));
        Employee employee1 = new Employee("Janusz", "Tracz", 86104275694l, List.of(new WorkIncome(5432.32)));
        Student workingStudent1 = new Student("Dariusz", "Grzybek", 95021004398l, List.of(new WorkIncome(3742.56), new ScholarshipIncome(410.78)));

        System.out.println(student1);
        System.out.println("Total income " + student1.getIncome());

        System.out.println(employee1);
        System.out.println("Total income " + employee1.getIncome());

        System.out.println(workingStudent1);
        System.out.println("Total income " + workingStudent1.getIncome());

    }
}
