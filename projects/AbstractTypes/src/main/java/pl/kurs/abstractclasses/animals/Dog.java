package pl.kurs.abstractclasses.animals;

public class Dog extends Animal {
    private String name;

    public Dog(String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("wow wow");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
