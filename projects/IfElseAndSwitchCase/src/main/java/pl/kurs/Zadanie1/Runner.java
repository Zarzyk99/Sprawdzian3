package pl.kurs.Zadanie1;

public class Runner {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "M3", false, true);
        CarService service = new CarService(bmw);
        System.out.println(bmw);


        service.closeRoof();
        System.out.println(bmw);



    }
}
