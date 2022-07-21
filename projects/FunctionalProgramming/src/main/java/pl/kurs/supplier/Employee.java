package pl.kurs.supplier;

import java.util.Random;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private int yearsOfExperience;

    public Employee() {
    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int yearsExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExperience = yearsExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCandidateIntroduction() {
        StringBuilder builder =
                new StringBuilder("Jestem " + firstName + " " + lastName + " i ");
        if(yearsOfExperience <= 0)
            builder.append("nie mam żadnego doświadczenia.");
        if(yearsOfExperience == 1)
            builder.append("mam 1 rok doświadczenia.");
        if(yearsOfExperience > 1)
            builder.append("mam " + yearsOfExperience + " lat doświadczenia.");
        return builder.toString();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", yearsExperience=" + yearsOfExperience +
                '}';
    }

    public static class Generator {
        private static String[] firstNames = {"Adam", "Marcin", "Robert", "Szymon", "Mariusz", "Dariusz", "Mirek", "Wiesiek"};
        private static String[] lastNames = {"Nowak", "Kowalski", "Malinowski", "Kwiatkowski", "Szymański", "Koczkodan", "Fiut", "Idec"};
        private static double[] salaries = {8_000, 10_000, 12_000, 14_000, 16_000, 18_000, 20_000};
        private static Random random = new Random();

        public static Employee generate() {
            String generatedFirstName = firstNames[random.nextInt(firstNames.length)];
            String generatedLastName = lastNames[random.nextInt(lastNames.length)];
            double generatedSalary = salaries[random.nextInt(salaries.length)];
            return new Employee(generatedFirstName, generatedLastName, generatedSalary);
        }
    }
}
