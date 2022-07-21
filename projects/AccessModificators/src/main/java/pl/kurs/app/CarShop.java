package pl.kurs.app;

import pl.kurs.service.CarFactory;
import pl.kurs.service.CarPainter;
import pl.kurs.model.Car;

public class CarShop {

    public static void main(String[] args) {


        Car alfaRomeo = new Car();
        System.out.println(alfaRomeo);
//        alfaRomeo.producer = "Alfa Romeo";
        alfaRomeo.setProducer("Alfa Romeo");
        System.out.println(alfaRomeo.getProducer());
        alfaRomeo.setModel("Gulia QV");
        alfaRomeo.setColor("Red");
        alfaRomeo.setVin("ASDGU23434");
        System.out.println(alfaRomeo.getVin());

        String info = alfaRomeo.getCarInfo();
        System.out.println(info);  //Rosso Alfa Romeo Giulia QV

        alfaRomeo.printCarInfo();


        CarPainter lakiernikZenek = new CarPainter();
        lakiernikZenek.setName("Zenek");
        lakiernikZenek.changeCarColor("Blue", alfaRomeo);
        alfaRomeo.printCarInfo();
        lakiernikZenek.changeVin("ADHSHDU2324", alfaRomeo);
        alfaRomeo.printCarInfo();


//        CarFactory factory = new CarFactory();
//        factory.factoryName = "Fabryka braci Colins";
//        Car myOrderedCarLesson = factory.buildBrandNewCar("Aston Martin" , "DB9", "Silver" , "AFHDWYR4234D");
//        myOrderedCarLesson.printCarInfo();
//        Car myOrderedCarLesson2 = factory.buildBrandNewCar("BMW", "750i", "Green", "ASD34234HFAD");
//        myOrderedCarLesson2.printCarInfo();


        Car gównoCar = CarFactory.buildBrandNewCar("FSO", "Polonez", "kolor gówna hehe", "chujowy win jak wsystko co polskie");
        gównoCar.printCarInfo();

        double pow = Math.pow(2, 3);
        System.out.println(pow);
        System.out.println(Math.PI);


        Car mazda = new Car("Mazda" , "mx-5" , "red", "adasdasd");
        mazda.printCarInfo();


        Car honda = new Car("Honda", "Civic", "blue", "asdasd", 2008);
        honda.printCarInfo();

    }
}
