package pl.kurs.interfaces.shapes;

public class Circle extends Figure implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }


    @Override
    public void printSomeInfo() {
//        Shape.super.printSomeInfo(); //użyje metody domyślnej z interfejsu shape
        super.printSomeInfo(); // użyje metody instancji z nadklasy Figure
    }
}
