package pl.kurs.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier = () -> new Employee("Kubuś", "Puchatek", 3000);
        Employee emp1 = employeeSupplier.get();
        System.out.println(emp1);
        System.out.println("-----------------");
        List<Employee> employees = generateList(10, () -> Employee.Generator.generate());
        employees.forEach(x -> System.out.println(x));
        doSomethingForAll(employees, e -> e.setSalary(e.getSalary() * 1.2));
        System.out.println("------------------------");
        employees.forEach(System.out::println);


    }

    public static <T> List<T> generateList(int capacity, Supplier<T> supplier) {
        List<T> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static <T> void doSomethingForAll(List<T> list, Consumer<T> consumer) {
        for (int i = 0; i < list.size(); i++) {
            consumer.accept(list.get(i));
        }
    }

}
