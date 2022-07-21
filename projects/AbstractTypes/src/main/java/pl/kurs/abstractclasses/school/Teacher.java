package pl.kurs.abstractclasses.school;

public class Teacher extends Person {
    private double salary;

    public Teacher(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getIncome() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Dzień dobry nazywam się " + firstName + ' ' + lastName + " i jestem nauczycielem.");
    }
}
