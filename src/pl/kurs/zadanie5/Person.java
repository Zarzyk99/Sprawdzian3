package pl.kurs.zadanie5;

import java.util.List;

public abstract class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private long pesel;
    private List<Income> incomes;

    public Person(String firstName, String lastName, long pesel, List<Income> incomes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.incomes = incomes;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public double getIncome(){
        double cash = 0;

        for (Income income : incomes)
            cash += income.getValue();

        return cash;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getIncome(), o.getIncome());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel + '\'' +
                ", income=" + getIncome() +
                '}';
    }


}
