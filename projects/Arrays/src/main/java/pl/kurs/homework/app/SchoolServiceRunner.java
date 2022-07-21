package pl.kurs.homework.app;

import pl.kurs.homework.models.Student;
import pl.kurs.homework.service.SchoolService;

import java.util.Arrays;

public class SchoolServiceRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Maćko", "Zbogdańca", "poprawne");
        Student student2 = new Student("Kuba", "Luj", "bardzo dobre");
        Student student3 = new Student("Rafał", "Kopka", "wzorowe");
        Student student4 = new Student("Dominka", "Nowak", "poprawne");
        Student student5 = new Student("Mariola", "Sowa", "dobre");
        Student student6 = new Student("Jacek", "Placek", "nieodpowiednie");

        SchoolService schoolService = new SchoolService(5);

        schoolService.addStudent(student1);
        schoolService.addStudent(student2);
        schoolService.addStudent(student3);
        schoolService.addStudent(student4);
        schoolService.addStudent(student5);
        schoolService.addStudent(student6);
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
    }
}
