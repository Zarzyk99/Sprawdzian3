package pl.kurs.Zadanie2.app;

import pl.kurs.Zadanie2.models.Burger;
import pl.kurs.Zadanie2.services.BurgerFactory;

public class BurgerTest {
    public static void main(String[] args) {

        BurgerFactory restaurant = new BurgerFactory();
        final String burger1 = "Ogniste uderzenie";
        final String burger2 = "Cheeseburger";
        final String burger3 = "Polak burger";

        String order = burger1;


        Burger burger = switch (order){
            case burger1 -> restaurant.createBurger("Ogniste uderzenie");
            case burger2 -> restaurant.createBurger("Cheeseburger");
            case burger3 -> restaurant.createBurger("Polak burger");
            default -> null;
        };

        if (burger != null)
            System.out.println("Twój burger to: " + burger);
        else
            System.out.println("Nie mamy takiego burgera w menu");





    }
}
