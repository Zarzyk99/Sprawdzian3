package pl.kurs;

public class Manager extends Employee{

    private boolean isAnnoying;

    public Manager(String firstName, String lastName, double salary, boolean isAnnoying) {
        super(firstName, lastName, salary);
        this.isAnnoying = isAnnoying;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", isAnnoying=" + isAnnoying +
                '}';
    }
}
