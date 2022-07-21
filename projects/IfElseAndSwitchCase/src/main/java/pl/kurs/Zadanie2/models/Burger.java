package pl.kurs.Zadanie2.models;

import java.io.Serializable;

public class Burger implements Serializable {
    private String name;
    private boolean cheese;
    private boolean onion;
    private boolean jalapeno;

    public Burger() {
    }



    public Burger(String name, boolean cheese, boolean onion, boolean jalapeno) {
        this.name = name;
        this.cheese = cheese;
        this.onion = onion;
        this.jalapeno = jalapeno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", onion=" + onion +
                ", jalapeno=" + jalapeno +
                '}';
    }

    public static Burger createPolakBurger() { //statyczna metoda fabryczna
        return new Burger("Polak burger", true, false, true);
    }
}
