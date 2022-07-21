package pl.kurs.homework.models;

public class Student {
    private String name;
    private String lastName;
    private String behaviorGrade;

    public Student(String name, String lastName, String behaviorGrade) {
        this.name = name;
        this.lastName = lastName;
        this.behaviorGrade = behaviorGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", behaviorGrade='" + behaviorGrade + '\'' +
                '}';
    }
}
