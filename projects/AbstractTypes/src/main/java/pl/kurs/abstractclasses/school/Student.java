package pl.kurs.abstractclasses.school;

public class Student extends Person {
    private double scholarship;

    public Student(String firstName, String lastName, double scholarship) {
        super(firstName, lastName);
        this.scholarship = scholarship;
    }


    @Override
    public void introduceYourself() {
        System.out.println("Dzień dobry nazywam się " + firstName + ' ' + lastName + " i jestem  uczniem.");
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", scholarship=" + scholarship +
                '}';
    }
}
