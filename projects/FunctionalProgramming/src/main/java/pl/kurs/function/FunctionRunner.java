package pl.kurs.function;

import java.util.function.Function;

public class FunctionRunner {
    public static void main(String[] args) {

        Function<String, Long> stringConverter = s -> Long.parseLong(s);

        long apply = stringConverter.apply("123");

        System.out.println(apply + 2);

        Adult marty = new Adult("Marty", "McFly", 30);
        Function<Adult, Child> backToThePast = x -> new Child(x.getFirstName(), x.getLastName(), 10);
        Child youngMartyMcFly = backToThePast.apply(marty);
        System.out.println(youngMartyMcFly);


    }
}
