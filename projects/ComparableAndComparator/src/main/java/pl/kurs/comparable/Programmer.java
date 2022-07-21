package pl.kurs.comparable;

public class Programmer implements Comparable<Programmer> {
    private String firstName;
    private String lastName;
    private double salary;
    private String mainProgrammingLanguage;

    public Programmer(String firstName, String lastName, double salary, String mainProgrammingLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", mainProgrammingLanguage='" + mainProgrammingLanguage + '\'' +
                '}';
    }

    //•	W pierwszej kolejności sortujemy po nazwisku alfabetycznie;
    //•	kiedy nazwiska są te same to sortujemy po imieniu alfabetycznie;
    //•	kiedy z kolei imiona też są te same to sortujemy po języku programowania alfabetycznie;
    //•	kiedy z kolei języki są te same to sortujemy po wypłacie malejąco.
    @Override
    public int compareTo(Programmer p) {
        int result = lastName.compareTo(p.lastName);
        if (result == 0)
            result = firstName.compareTo(p.firstName);
        if (result == 0)
            result = mainProgrammingLanguage.compareTo(p.mainProgrammingLanguage);
        if (result == 0)
            result = Double.compare(p.salary, salary);
        return result;
    }
}
