package pl.kurs.comparator;

import java.util.Arrays;

public class ComparatorRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Corsa", 'B', 100, 130, 160);
        Car car2 = new Car("Opel", "Corsa", 'C', 100, 130, 160);
        Car car3 = new Car("Nissan", "GT-R", 'R', 570, 632, 315);
        Car car4 = new Car("Nissan", "GT-R", 'R', 800, 850, 340);

        Car[] cars = {car1, car2, car3, car4};

        Arrays.sort(cars, new GeneralSpecsCarComparator());

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("-------------------------");
        Arrays.sort(cars, new PerformanceSpecsCarComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
