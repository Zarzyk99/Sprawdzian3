package pl.kurs.methodreferences;

import pl.kurs.supplier.Employee;

import java.util.function.*;

public class MethodReferencesRunner {
    public static void main(String[] args) {
        Employee emp = new Employee("Zenek", "Martyniuk", 5);
        Predicate<Employee> experienceTesterLambda = x -> Office.meetsRequiredExperience(x);
        boolean b1 = experienceTesterLambda.test(emp);
        System.out.println(b1);
        System.out.println("----------------------------------");

        Predicate<Employee> experienceTesterMethodRef = Office::meetsRequiredExperience;// referencja do metody statycznej
        boolean b2 = experienceTesterMethodRef.test(emp);
        System.out.println(b2);
        System.out.println("----------------------------------");


        Office office = new Office();
        BiConsumer<Employee, Double> hireConsumerLambda = (e, s) -> office.hireEmployee(e, s);
        hireConsumerLambda.accept(emp, 40_000d);
        BiConsumer<Employee, Double> hireConsumerMethodRef = office::hireEmployee;//referencja do metody instancji
        System.out.println("----------------------------------");


        Function<Employee, String> introductionFunctionLambda = x -> x.getCandidateIntroduction();
        String apply = introductionFunctionLambda.apply(emp);
        System.out.println(apply);//do referencja do metody instancji wywoływanej na parametrze wyrażenia lambda
        Function<Employee, String> introductionFunctionMethodRef = Employee::getCandidateIntroduction;
        System.out.println("----------------------------------");


        //referencje do konstruktorów
        Supplier<Employee> supplier1 = Employee::new;
        Supplier<Employee> supplier2 = () -> new Employee("Mariusz", "Konopka", 4);
        EmployeeSupplier supplier3 = Employee::new;
        System.out.println(supplier3.get("Kubuś", "Puchatek", 10));




    }
}
