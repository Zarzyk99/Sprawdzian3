package pl.kurs;

public class Person {
    public static void main(String[] args) {
        String firstName = "Tomek";
        String lastName = "Kowalski";
        String wifeName = "Anię";
        int age =  34;
        int yearOfBirth = 1987;
        String pesel = "87042305678";
        int groupOfChildren = 2;
        String workplace = "w szpitalu";
        String profession = "lekarz pediatra";
        int roomCounter = 3;
        String flatLevel = "na 3 piętrze";
        int carCounter = 2;
        String animal = "psy";
        int animalCounter = 2;
        String hobby = "podróżowanie";
        String physique = "szczupły";
        String eyeColor = "niebieskie";
        String hairColor = "blond";
        int siblingsCounter = 5;
        int sistersCounter = 3;
        int brothersCounter = 2;
        String favouriteMeal = "spaghetti";
        String placeOfOrigin = "ze wsi";
        String education = "studia medyczne";
        String activities = "gra w koszykówkę";

        System.out.println("To jest " + firstName + '.' + lastName + '.');
        System.out.println(firstName + ' ' + lastName + " ma " + age + " lata.");
        System.out.println(firstName + " urodził się w " + yearOfBirth + " roku.");
        System.out.println("Tomka pesel to " + pesel + '.');
        System.out.println(firstName + " " + lastName + " ma żone " + wifeName + " i " + groupOfChildren + " dzieci.");
        System.out.println(firstName + " posiada " + roomCounter + " pokojowe mieszkanie " + flatLevel + '.');
        System.out.println(firstName + " jest posiadaczem " + carCounter + " aut.");
        System.out.println("W domu " + firstName + " ma " + animalCounter + " " + animal + '.');
        System.out.println("Jego hobby to " + hobby + '.');
        System.out.println(firstName + " " + lastName + " jest " + physique + ", ma " + eyeColor + " oczy i " + hairColor + " włosy.");
        System.out.println(firstName + " ma " + siblingsCounter + " rodzeństwa, " + sistersCounter + " siostry i " + brothersCounter + " braci.");
        System.out.println("Jego ulubionym daniem jest " + favouriteMeal + '.');
        System.out.println(firstName + " pochodzi " + placeOfOrigin + ".");
        System.out.println(firstName + " " + lastName + " ukończył " + education + '.');
        System.out.println(firstName + " w wolnym czsie " + activities + '.');
        //Tomek powiedział, cytuję "do końca życia nie zapomnę wczorajszego wieczoru".
        System.out.println(firstName + " " + lastName + " powiedział, cytuję \"do końca życia nie zapomnę wczorajszego wieczoru\".");
    }
}
