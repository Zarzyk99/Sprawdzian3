package pl.kurs.Zadanie2.services;

import pl.kurs.Zadanie2.models.Burger;

public class BurgerFactory {


    public Burger createBurger(String burgerName) {
        Burger burger = null;
        if (burgerName.equals("Ogniste uderzenie"))
            burger = new Burger(burgerName, false, true, true);
         if (burgerName.equals("Cheeseburger"))
            burger = new Burger(burgerName,true, false, false);
        if (burgerName.equals("Polak Burger"))
            burger = new Burger(burgerName,true, true, false);
        return burger;
    }

}
