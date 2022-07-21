package pl.kurs.interfaces.shapes;

public interface Shape {
    // każda metoda w interface jest domyślnie publiczna i abstrakcyjna


    double calculateArea();

    double calculatePerimeter();

    static void printInfoStatic() { //metoda statyczna -odpala się bezpośrednio na interfejsie
        System.out.println("jestem metoda statyczną z intefejsu Shape" + getLolStaticVersion());
    }

    default void printFancyWord(String input) { //metoda domyślna - odpala się ją na obiekcie klasy implementującej interfejs shape. Można tą metodę napisywać sobie
        System.out.println("Fancy " + input + getLol());
    }

    private String getLol() {
        return "LOL";
    }

    private static String getLolStaticVersion() {
        return "LOL";
    }


    default void printSomeInfo(){
        System.out.println("Jestem metodą domyślną z interfejsu shape");
    }


}
