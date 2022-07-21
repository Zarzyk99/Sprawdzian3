package pl.kurs;

public class Runner {

    public static void main(String[] args) {


        Car car = new Car("Ford", "r5", 6, 100, 15);

        Car.Engine ls7supercharged = new Car("trabant", "dwusuwowe gowno", 3, 1000, 10).new Engine("ls7", 25);
        Car.Engine v6turbo = new Car().new Engine("v6turbo", 14);


        Car gt2rs = new Car("Porsche GT2RS", "B6 3.8 twin turbo", 14, 1000, 40);

        Car.Engine silnikOdKosiarki = gt2rs.new Engine("Brigs And Straton", 1);
        System.out.println(car);
        car.drive100km();

        System.out.println(car);


        Chopper chopper = new Chopper("HD", "V4", 1600);
        System.out.println(chopper);


        Chopper.MotorcycleEngine desmosediciStradale = new Chopper.MotorcycleEngine("desmosediciStradale", 1000);


        printInsult("Putin");


        StringWorkshop stringWorkshop2 = new StringWorkshop() {// anonimowa klasa wewnętrzna
            @Override
            public String addSomeShit(String input) {
                return input + " jebane gówno!";
            }
        };

        String lukaszenka = stringWorkshop2.addSomeShit("Łukaszenka");
        System.out.println(lukaszenka);


    }

    static void printInsult(String target) {

        class Bluzgator { //lokalna klasa wewnętrzna
            public String getInsult() {
                return target + " ty chuju jebany!";
            }
        }

        Bluzgator b = new Bluzgator();

        System.out.println(b.getInsult());

        StringWorkshop stringWorkshop = new StringWorkshopImpl();
        String s = stringWorkshop.addSomeShit("Putin");
        System.out.println(s);
    }
}