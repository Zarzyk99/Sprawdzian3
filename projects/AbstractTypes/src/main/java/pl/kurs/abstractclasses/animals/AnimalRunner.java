package pl.kurs.abstractclasses.animals;

import pl.kurs.abstractclasses.animals.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
//        Animal animal = new Animal("gad"); nie da rady tworzyć obiektów abstrakcyjnych
//        animal.makeSound();
        Dog dog = new Dog("łachudra podwórkowa", "Burek");
        System.out.println(dog);
        dog.makeSound();
    }
}
