package pl.kurs;

import java.util.Arrays;

public class ArraysRunner {
    public static void main(String[] args) {
        //tablice jednowymiarowe
        int[] array1 = new int[10];
        double[] array2 = new double[5];
        char[] array3 = new char[7];
        boolean[] array4 = new boolean[3];
        String[] array5 = new String[5];

        int[] array11 = new int[]{12, 1, 4, 6};
        int[] array111 = {12, 1, 4, 6};

        int[] array22;
        array22 = new int[]{12, 1, 4, 6};

        int[] array222;
        //array222 = {12, 1, 4, 6}; nie da rady tak zrobić


        //dodawanie elemerntów do tablicy
        String[] carsBrands = new String[5];
        carsBrands[0] = "BMW";
        carsBrands[1] = "Audi";
        carsBrands[2] = "Mercedes";
        carsBrands[3] = "Ford";
        carsBrands[4] = "Fiat";
        System.out.println(Arrays.toString(carsBrands)); // wyświetlanie elementów tablicy


        System.out.println("-------------------------");
        // teraz tablice wielowymiarowe

        int[][] tab = new int[3][3];


//        tab[0][0]     tab[0][1]      tab[0][2]
//
//      tab[1][0]     tab[1][1]      tab[1][2]
//
//      tab[2][0]     tab[2][1]      tab[2][2]


        String[] heroes = {"Batman", "Spiderman", "Robocop"};
        String[] cities = {"New York", "Detroit", "Gotham"};
        String[][] heroesAndCities = {heroes, cities};
        System.out.println(Arrays.deepToString(heroesAndCities));


        System.out.println("Zagadka nocnego mściciela");
        System.out.println("Bohater: " + heroesAndCities[0][0]);
        System.out.println("Miastoo: " + heroesAndCities[1][2]);

        System.out.println("Zagadka chudzielca w czerwonych rajtach ");
        System.out.println("Bohater: " + heroesAndCities[0][1]);
        System.out.println("Miastoo: " + heroesAndCities[1][0]);

        System.out.println("Zagadka zakutego łba");
        System.out.println("Bohater: " + heroesAndCities[0][2]);
        System.out.println("Miastoo: " + heroesAndCities[1][1]);

        String[][][] array3D = new String[2][3][3];
//        String[][][] array3D = new String[1][1][1];
        System.out.println(Arrays.deepToString(array3D));
    }
}
