package pl.kurs.zadanie2;

public class Day {
    private String name;
    private int count;

    public Day(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Day{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

