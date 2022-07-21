package pl.kurs.interfaces.shapes;

public class Triangle implements Shape, GenericShape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a * h) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * a;
    }

    @Override
    public void printFancyWord(String input) {
        System.out.println("Nadpisana metoda domyslna printFancyWord: " + input);
    }

    @Override
    public void printSomeInfo() {
        Shape.super.printSomeInfo();
    }

}
