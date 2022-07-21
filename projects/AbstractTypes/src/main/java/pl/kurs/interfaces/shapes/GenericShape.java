package pl.kurs.interfaces.shapes;

public interface GenericShape {

    default void printSomeInfo() {
        System.out.println("Jestem metodą domyślną z GenericShape");
    }
}
