package pl.kurs.expedition;

public class ExpeditionRunner {
    public static void main(String[] args) {
        //Zadanie dla kursanta na zajęcia:
        //zadanie:
        //Stwórz klase Samochód, Łódź oraz klasę Amfibia. Każda klasa ma mieć tylko pole 'nazwa'
        //Stwórz sobie serwis ExpeditionService
        //ten serwis ma mieć metody  (w ich parametrach ma być mozliwość podania jakiegoś obiektu jednej z powyższych klas lub dziedziczacych po nich):
        //ruszWMorze(); - drukuje informację, że dany pojazd rusza w morze
        //ruszWDrogę(); - analogicznie co wyżej ale że w drogę
        //Założenia - nie może być możliwości, że samochód ruszy w morze, albo, że łódź ruszy w drogę. Pamiętaj, że Amfibia może to i to.

        Car car = new Car("gruz");
        Boat boat = new Boat("kajak");
        Amphibious amphibious = new Amphibious("amfiba");
        ExpeditionService expeditionService = new ExpeditionService();
        expeditionService.ruszWDroge(car);
//        expeditionService.ruszWDroge(boat);
        expeditionService.ruszWDroge(amphibious);
        expeditionService.ruszWMorze(boat);
        expeditionService.ruszWMorze(amphibious);
//        expeditionService.ruszWMorze(car);
    }
}
