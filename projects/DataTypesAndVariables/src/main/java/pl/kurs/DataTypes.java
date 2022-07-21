package pl.kurs;

import java.math.BigDecimal;

public class DataTypes {
    public static void main(String[] args) {
        //typy prymitywne(proste) całkowitoliczbowe

//        byte - 1 bajt - zakres od -128 do 127 =256 liczb
//        short - 2 bajty - zakres od -32 768 do 32 767 =256^2 liczb
//        int - 4 bajty - zakres od -2 147 483 648 do 2 147 483 647 -  typ domyślny
//        long - 8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L, lub l, trzeba dodawać bo bez przyrostka do longa przypiszemy tak naprawdę inta)
        System.out.println(120);
        System.out.println(3_000_000_000L);
        System.out.println(999999999999999999L);


        // typy prymitywne zmiennoprzecinkowe
//        float - 4 bajty - max ok 6-7 cyfr po przecinku (posiadają przyrostek F, lub f, który jest obligatoryjny)
//        double - 8 bajtów - max ok 15-16 cyfr po przecinku (posiadają przyrostek D, lub d ale nie trzeba dodawać) - typ domyslny


        System.out.println(3.14564558467534524526264545235645255654355652546453245545434554F);
        System.out.println(3.14564558467534524526264545235645255654355652546453245545434554D);
        System.out.println(11234239.123356456757);
        System.out.println(0.0000003);


        System.out.println(2.0 - 1.5);
        System.out.println(2.0 - 1.2);
        System.out.println(2.0 - 1.1); //roundof error

        BigDecimal n1 = BigDecimal.valueOf(2.0);
        BigDecimal n2 = BigDecimal.valueOf(1.1);
        System.out.println(n1.subtract(n2));

        //Typ prymitywny zankowy - char (2 bajty / 16 bit) - reprezentuje jeden znak (literał znakowy - apostrof)
        System.out.println('1');
        System.out.println('!');
        System.out.println('a');
        System.out.println('A');
        System.out.println('.');
        System.out.println(' ');
        System.out.println('-');
        System.out.println('ą');
        System.out.println('\u0105'); //współrzędna kodowa jednostki znakowej z tabel unicode
        System.out.println('\u6546');
        System.out.println('\u2602');
        System.out.println('\u2603');

        System.out.println("    Ala ma kota");
        System.out.println();
        System.out.println("\tAla ma kota\n");
        System.out.println('\t' + "Ala\\ ma kota" + '\n');
        System.out.println("\"Ala ma kota\"");

        //typ prymitywny logiczny boolean (1 bit)- true/false
        System.out.println(true);
        System.out.println(false);


        // typ obiektowy String - reprezentue łancuch znakow(liteał stringowy)
        System.out.println("Ala ma kota");
        System.out.println("Ala");
        System.out.println("A");
        System.out.println("1");
        System.out.println(" ");
        System.out.println("");
        System.out.println();





    }
}
