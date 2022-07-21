package pl.kurs.interfaces.homework;

public interface PetOwner {
    void feedingThePet();

    void playWithYourPet();

    void shoutAtThePet();

    void patThePet();

    static void adoptPet(Person person, Pet pet, String petName) {
        if (person.getOwnedPet() != null)
            System.out.println(person.getName() + " posiada już swoje zwierzątko.");
        else {
            person.setOwnedPet(pet);
            person.getOwnedPet().setName(petName);
        }
    }

    default void introduceYourselfAndYourPet() {
        System.out.println("ddasd");
    }

//    default void introduceYourselfAndYourPet() {
////        System.out.println("To jest " + person.getName() + " a to jest jego zwierzak " + person.getOwnedPet().getName());
//    }

        static void petDisadoption(Person person){//to chyba usune bo w sumie to nie jest podane w zadaniu

        person.setOwnedPet(null);

    }
//

}
