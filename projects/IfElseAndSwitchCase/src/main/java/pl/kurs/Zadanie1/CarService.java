package pl.kurs.Zadanie1;

public class CarService {
    private Car car;

    public CarService(Car car) {
        this.car = car;
    }

    void openRoof() {
        if (car.isOpenRoof()) {
            System.out.println("Dach jest już otwarty.");
        } else {
            if (car.isMoving())
                System.out.println("Nie można otworzyć dachu. Aby otworzyć dach należy się zatrzymać.");
            else {
                System.out.println("Otwieranie dachu...");
                car.setOpenRoof(true);
            }
        }
    }

    void closeRoof() {
        if (!car.isOpenRoof()) {
            System.out.println("Dach jest już zamknięty.");
        } else {
            if (car.isMoving())
                System.out.println("Nie można zamknąć dachu. Aby zamknąć dach należy się zatrzymać.");
            else {
                System.out.println("Zamykanie dachu...");
                car.setOpenRoof(false);
            }

        }

    }
}
