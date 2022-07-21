package pl.kurs.interfaces.homework;

public class PetsOwnersRunner {
    public static void main(String[] args) {
        Person maciek = new Person("Maciek");
        Person ania = new Person("Ania");
        Person darek = new Person("Darek");
        Person justyna = new Person("Justyna");

        Pet mruczek = new Cat();
        Pet ciapek = new Dog();
        Pet burek = new Dog();
        Pet pusia = new Cat();
        Cat kot = new Cat();


        System.out.println(maciek);
        System.out.println(ania);
        System.out.println(darek);
        System.out.println(justyna);

        PetOwner.adoptPet(maciek, mruczek, "Klakier");
        PetOwner.adoptPet(maciek, burek, "Reksio");
        PetOwner.adoptPet(ania, pusia, "Pusia");
        PetOwner.adoptPet(darek, ciapek, "Fafik");
        PetOwner.adoptPet(justyna, burek, "Kabanos");

        maciek.feedingThePet();
        ania.shoutAtThePet();
        darek.patThePet();//nie powinno sie tak robić zwierzakom :(
        justyna.playWithYourPet();

        System.out.println(' ');
        System.out.println(maciek);
        System.out.println(ania);
        System.out.println(darek);
        System.out.println(justyna);
        System.out.println(' ');

        PetOwner.petDisadoption(justyna);
        System.out.println(justyna.getOwnedPet());
        PetOwner.adoptPet(justyna,burek,"lala");
        System.out.println(justyna.getOwnedPet());


        maciek.introduceYourselfAndYourPet();
    }
}
