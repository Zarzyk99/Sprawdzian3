package pl.kurs.homework.service;

import pl.kurs.homework.models.Student;

public class SchoolService {
    private Student[] students;
    private int lastStudentIndex;

    public SchoolService(int capacity) {
        this.lastStudentIndex = -1;
        students = new Student[capacity];
    }
    public void addStudent(Student student){
        if(student == null) {
            System.out.println("Student nie może być nullem!");
            return;
        }

        if (students.length == lastStudentIndex + 1) {
            System.out.println("Nie można dodać nowego studenta, ponieważ lista jest już pełna");
        } else {
            students[++lastStudentIndex] = student;
            System.out.println("Dodano nowego studenta: " + student);
        }
    }
    public void deleteLastAddedStudent(){
        if(lastStudentIndex < 0){
            System.out.println("Lista studentów jest pusta");
        } else {
            Student student = students[lastStudentIndex];
            System.out.println("Usunięto z listy ostatnio dodanego studenta: " + student);
            students[lastStudentIndex--] = null;
        }
    }


}
