package pl.kurs;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);

        System.out.println(integerList);

        Pair pair = new Pair(); //nie powinniśmy tworzyć typów surowych - czyli takich bez parametryzowania

        System.out.println(pair.getSecond());
        System.out.println(pair.getFirst());

        Pair<String> stringPair = new Pair<>("Adam", "Ewa");
        System.out.println(stringPair.getFirst());
        System.out.println(stringPair);


        ArraysPair<String, Integer> stringIntegerArraysPair = new ArraysPair<>(new String[]{"Adam", "Ewa"}, new Integer[]{1, 2, 3});

        System.out.println(stringIntegerArraysPair.arraysHaveSameType());
        System.out.println(stringIntegerArraysPair);

        ArraysPair<Boolean, Boolean> booleanBooleanArraysPair = new ArraysPair<>(new Boolean[]{true, true}, new Boolean[]{false, false});
        System.out.println(booleanBooleanArraysPair);

        System.out.println(booleanBooleanArraysPair.arraysHaveSameType());
        System.out.println(booleanBooleanArraysPair.arraysHaveSameLength());


        Integer fromMiddle = getFromMiddle(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(fromMiddle);

        System.out.println(getFromMiddle("ala", "fala", "hala"));
        Number i = getFromMiddle(1, 1.2, 0, 4, 1);



        Car car = new Car("Ford", "Focus", 2017);
        Car car1 = new Car("BMW", "M3", 2017);
        SavingService.saveObject(car, "car.obj");
        SavingService.saveObject(car1,"car.obj");

        List<Integer> integers = new ArrayList<>();
    }

    public static <T> T getFromMiddle(T... elements) {
            return elements[elements.length/2];

    }
}
