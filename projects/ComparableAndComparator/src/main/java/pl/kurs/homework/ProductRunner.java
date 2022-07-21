package pl.kurs.homework;

import java.util.Arrays;

public class ProductRunner {
    public static void main(String[] args) {
        Product product1 = new Product("Biała fasola", 0.4, "Bonduelle", 4.49, 18, "Polska", 0.04);
        Product product2 = new Product("Oliwa z oliwek", 0.2, "Monini", 11.99, 8, "Włochy", 0.06);
        Product product3 = new Product("Ogórki kiszone" , 0.81, "Krokus", 12.99, 12,"Polska", 0.05);
        Product product4 = new Product("Mąka Szymanowsa", 1, "Polskie Młyny" , 3.59, 12, "Polska", 0.06);
        Product product5 = new Product("Cukier", 1, "Cukier Królewski", 5.89, 12, "Polska", 0.04);
        Product product6 = new Product("Przecier pomidorowy", 0.680, "Cirio", 9.59, 6, "Włochy", 0.05);
        Product product7 = new Product("Coca-Cola", 1.5, "The Coca-Cola Company", 5.99, 4, "USA", 0.05);
        Product[] products ={product1,product2,product3,product4,product5,product6,product7};
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("----------------------------------");
        Arrays.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }

    }
}
