package pl.kurs.abstractclasses.school;

public abstract class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public abstract void introduceYourself();
    public abstract double getIncome();

}
