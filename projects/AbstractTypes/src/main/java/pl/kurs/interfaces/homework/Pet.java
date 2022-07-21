package pl.kurs.interfaces.homework;

public abstract class Pet {
    private String name;
    private Excitement excitement;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setExcitement(Excitement excitement) {
        this.excitement = excitement;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name = '" + name + '\'' +
                ", ekscytacja = " + excitement +
                '}';
    }
}
