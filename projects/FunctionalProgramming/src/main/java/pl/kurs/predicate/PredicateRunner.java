package pl.kurs.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {

        Predicate<Long> evenNumberTester = x -> x != 0 && x % 2 == 0 ;
        boolean b1 = evenNumberTester.test(0l);
        System.out.println(b1);

        Car car1 = new Car("Audi", "A3", true);
        Car car2 = new Car("BMW", "E46" , false);
        BiPredicate<Car, Car> carPredicateComparator = (x1, x2) -> x1.equals(x2);
        boolean carsTest = carPredicateComparator.test(car1, car2);
        System.out.println(carsTest);



    }
}
