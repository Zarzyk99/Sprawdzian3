package pl.kurs;

import pl.kurs.exceptions.homework.SimpleLogger;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {

        SimpleLogger logger = new SimpleLogger();

        var scanner = new Scanner(System.in);
        String[] names = {"Adam", "Ewa"};


        boolean errorOccurs = true;
        do {
            try {
                System.out.println("Podaj liczbę całkowitą:");
                int userNumber = scanner.nextInt();
                System.out.println("Podana liczba: " + userNumber);
                System.out.println("A teraz podaj indeks imienia z talbiy");
                String name = names[scanner.nextInt()];
                System.out.println("wybrane imie to: " + name);
                errorOccurs = false;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                logger.log(e);
                if(e.getMessage() == null)
                    System.err.println("Błędne dane!");
                else
                    System.out.println(e.getMessage());
//
            } finally {
                scanner.nextLine();
            }

        } while (errorOccurs);

        System.out.println("Dalsze instrukcje, które się wykonają...");
        scanner.close();
        System.out.println();
        System.out.println("Lista błędów: ");

        logger.printLogs();
        logger.printLogsInTxt();


//        System.out.println(Timestamp.from(Instant.now()));



    }
}
