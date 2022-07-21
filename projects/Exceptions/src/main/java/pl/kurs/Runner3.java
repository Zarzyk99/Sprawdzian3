package pl.kurs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {
        //try catch with resorces

        try (
                Scanner scanner = new Scanner(System.in);
                ) {
            System.out.println("Podaj Liczbę całkowitą:");
            long inputNumber = scanner.nextLong();
            System.out.println("Wprowadziłeś: " + inputNumber);

        }catch (InputMismatchException e) {
            System.err.println("Podano błędne dane!!!");
        }



    }
}
