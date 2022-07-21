package pl.kurs.interfaces.homework;

public class Person implements PetOwner {
    private String name;
    private Pet ownedPet;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Pet getOwnedPet() {
        return ownedPet;
    }

    public void setOwnedPet(Pet ownedPet) {
        this.ownedPet = ownedPet;
    }

    @Override
    public void feedingThePet() {
        ownedPet.setExcitement(Excitement.CALM);
        System.out.println(name + " nakłada karme dla " + ownedPet.getName());
    }

    @Override
    public void playWithYourPet() {
        ownedPet.setExcitement(Excitement.LUCKY);
        System.out.println(name + " bawi się ze swoim zwierzakiem");
    }

    @Override
    public void shoutAtThePet() {
        ownedPet.setExcitement(Excitement.SAD);
        System.out.println(name + " krzyczy na swojego zwierzaka");
    }

    @Override
    public void patThePet() {
        ownedPet.setExcitement(Excitement.AGGRESSIVE);
        System.out.println(name + " daje klapsa swojemu zwierzakowi");
    }

    @Override
    public void introduceYourselfAndYourPet() {
        System.out.println("To jest " + name + " i jest właścicielem " + ownedPet.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ownedPet=" + ownedPet +
                '}';
    }
}
