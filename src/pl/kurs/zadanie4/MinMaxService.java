package pl.kurs.zadanie4;

import java.util.List;
import java.util.Objects;

public class MinMaxService {

    public static <T extends Comparable> MinMax getMinAndMax(List<T> elements) {
        Objects.requireNonNull(elements);

        return new MinMax<>(

                elements.stream()
                        .max((o1, o2) -> o1.compareTo(o2))
                        .get(),

                elements.stream()
                        .min((o1, o2) -> o1.compareTo(o2))
                        .get()
        );
    }
}
