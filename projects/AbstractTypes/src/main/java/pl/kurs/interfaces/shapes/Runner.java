package pl.kurs.interfaces.shapes;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle1 = new Triangle(6, 4);
        Triangle triangle2 = new Triangle(8, 5);

        System.out.println(averageArea(circle, triangle1, triangle2));

        circle.printFancyWord("heheszki");
        triangle1.printFancyWord("dupa");

        Shape.printInfoStatic();


        circle.printSomeInfo();

        triangle1.printSomeInfo();

    }
    public static double averageArea(Shape... shapes){
        if (shapes == null) throw new IllegalArgumentException("Brak shapów!");
        int counter = 0;
        int areaSum = 0;

        for (Shape shape : shapes) {
            if(shape != null) {
                areaSum += shape.calculateArea();
                counter++;
            }
        }
        return areaSum / counter;

    }
}
