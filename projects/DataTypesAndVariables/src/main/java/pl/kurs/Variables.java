package pl.kurs;

import java.math.BigInteger;

public class Variables {
    public static void main(String[] args) {


        int a; //deklaracja zmiennej
        a = 5;//inicjacja/inicjalizacja
        System.out.println(a);
        System.out.println(a + 20);
        a = 10;
        System.out.println(a);
        System.out.println(a + 20);


        double b = 1.2; //deklaracja z inicjacją

        byte b1 = 20;
        short s1 = 30_000;
        long l1 = 234_246_526_734_731L;
        long l2 = 234;
        float f1 = 0.234F;
        double d1 = 0.234D;
        boolean bool1 = true;
        String str1 = "Hello";
        System.out.println(s1);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bool1);
        char ch1 = 'c';
        char ch2 = 99; //wartość z tablicy ASCII
        char ch3 = 00143; //99 zapisane ósemkowo
        char ch4 = 0x63; //99 zapisane szesnastkowo
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);


        int redCarCounter; //lowerCamelCase
        //System.out.println(redCarCounter); błąd kompilacji ponieważ nie możemy odwołać się do niezaincjowanej zmiennej
        boolean ściema = false;
        System.out.println(ściema);

        int i, j, k, l = 0, m, n; //nie robić tak, bo zaciemnia kod


        System.out.println("---------------------------------------");
        String firstName = "Ania";
        String lastName = "Nowak";
        int age = 40;
        int carsNumber = 3;
        String drivingLicenceCategory = "B";
        String idCardNumber = "CAZ1234";
        int yearsToAdd = 5;


        System.out.println(firstName + ' ' + lastName + " ma " + age + " lat");
        System.out.println("Ania Kowalska posiada 3 samochody osobowe");
        System.out.println(firstName + ' ' + lastName + " posiada " + carsNumber + " samochody osobowe");
        System.out.println("Ania ma prawo jazdy kategorii B");
        System.out.println(firstName + " ma prawo jazdy kategorii " + drivingLicenceCategory);
        System.out.println("Ania Kowalska ma dowód osobisty o numerze CAZ1234");
        System.out.println(firstName + ' ' + lastName + " ma dowód osobisty o numerze " + idCardNumber);
        System.out.println("Za 5 lat Ania Kowalska będzie miała 35 lat");
        System.out.println("Za " + yearsToAdd + " lat " + firstName + ' ' + lastName + " będzie miała " + (age + yearsToAdd) + " lat");
        byte b5 = 123;
        int i7 = 54_234;
        short s8 = 12_123;
        long l3 = 234_234_234L;
        float f4 = 12.2343F;
        double d5 = 12.324234233D;
        String s5 = "Mateo";
        System.out.println(b5);
        System.out.println(i7);
        System.out.println(s8);
        System.out.println(l3);
        System.out.println(f4);
        System.out.println(d5);
        System.out.println(s5);


        char ch8 = '\u2610';
        char ch5 = '\u2688';
        System.out.println(ch8);
        System.out.println(ch5);
        boolean racja = true;
        System.out.println(racja);
        System.out.println('a');
        System.out.println('\u2654');
        System.out.println('\'');
        System.out.println('\"');
        System.out.println(2 + 2);
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        // Pytanie: Dlaczego wyszedł tutaj taki wynik
        System.out.println(ch2 + ch5);
        //Pytanie: Dlaczego char ch1 po dodaniu przed nim znaku + zmienił zmienił się ze znaku "c" na liczbę 99
        System.out.println(s5 + " " + ch1);
        System.out.println(s5 + + ch1);
        System.out.println(s5 + '\\' + ch1);
        // "ładny mamy dzisiaj dzien"
        System.out.println("\"ładny mamy dzisiaj dzien\"");
        System.out.println("\"ładny mamy dzisiaj dzien\"\n");
        System.out.println("\"ładny mamy dzisiaj dzien\"\t");
        //Pytani: Czy kompilator za każdym razem do znaków specjalnych dodaje backslash gdy wklejamy tekst czy czasami trzeba to przypilnować?
        System.out.println(123_123_123_123L);
        System.out.println(123_123_123);
        System.out.println(123.324F);
        System.out.println(123_123_123_123_123L);
        //Pytanie: Jak zapisać większe liczby które wychodzą poza zakres long?

    }
}
