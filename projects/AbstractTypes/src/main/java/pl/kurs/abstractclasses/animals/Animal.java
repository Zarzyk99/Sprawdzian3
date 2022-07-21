package pl.kurs.abstractclasses.animals;

public abstract class  Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract void makeSound();//metoda abstrakcyjna narzuca odbowiązek impementacji w podklasie dziedziczącej
    // (pod warunkiem że klasa dziecząca nie jest klasą obstrakcyjną

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "type='" + type + '\'' +
                '}';
    }


}
