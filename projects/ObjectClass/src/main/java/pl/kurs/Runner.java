package pl.kurs;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jan","Nowak", 55_000);
        Employee emp2 = new Employee("Jan","Nowak", 55_000);

        System.out.println(emp1 == emp2); //sprawdzane jest czy referencja emp1 wskazuje na ten sam obiekt co referencja emp2
        System.out.println(emp1.equals(emp2));


        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

      Manager mgr = new Manager("Marek", "Pogromcaszparek", 23_423, false);
        System.out.println(mgr);


    }
}
