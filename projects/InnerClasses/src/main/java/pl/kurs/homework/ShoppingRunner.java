package pl.kurs.homework;

public class ShoppingRunner {
    public static void main(String[] args) {
        Product woda = new Product("woda", "Cisowianka", 1.5, 2.4);
        Product chleb = new Product("chleb", "Piekarnia Żyto", 0.7, 3.2);
        Product mleko = new Product("mleko", "Laciate", 1.1, 2.6);
        Product jajka = new Product("jajka", "Kura domowa", 0.65, 7.5);
        Product kisiel = new Product("kisiel", "Dr. Oetker", 0.03, 1.2);
        Product ketchup = new Product("ketchup", "Heinz", 0.46, 3.5);
        Product papierToaletowy = new Product("papier toaletowy", "Regina", 0.91, 16.99);
        Product makaron = new Product("makaron", "Lubella", 0.4, 3.8);
        Product majonez = new Product("majonez kielecki", "Społem Kielce", 0.8, 7.99);
        Product bagietka = new Product("bagietka", "Piekarnia Żyto", 0.14, 2.19);
        Product chipsy = new Product("chipsy", "Lay's", 0.14, 6.5);
        Product serekWiejski = new Product("serek wiejski", "Piątnica", 0.15, 2.4);

        BigBasket bigBasket = new BigBasket(8, 4);

        bigBasket.addProduct(woda);
        bigBasket.addProduct(chleb);
        bigBasket.addProduct(mleko);
        bigBasket.addProduct(jajka);
        bigBasket.addProduct(kisiel);
        bigBasket.addProduct(ketchup);
        bigBasket.addProduct(papierToaletowy);
        bigBasket.addProduct(makaron);
        bigBasket.addProduct(majonez);
        bigBasket.addProduct(bagietka);
        System.out.println(bigBasket.getInfoOfBigBasket());
        System.out.println(bigBasket.getInfoOfSmallBasket());
        System.out.println("Całkowita cena produktów w koszyku " + bigBasket.totalPrice() + " zł");

        System.out.println("Całkowita waga produktów w koszyku " + bigBasket.totalWeight() + " kg");


    }

}


