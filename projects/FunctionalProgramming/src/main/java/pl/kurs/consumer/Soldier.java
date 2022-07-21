package pl.kurs.consumer;

public class Soldier {
    public enum Rank{
        PRIVATE,
        COPORALL,
        SERGEANT,
        CAPITAN,
        MAJOR,
        GENERAL
    }
    private String firstName;
    private String lastName;
    private Rank rank;

    public Soldier(String firstName, String lastName, Rank rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank=" + rank +
                '}';
    }
}
