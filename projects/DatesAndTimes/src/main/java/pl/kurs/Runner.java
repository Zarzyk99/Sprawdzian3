package pl.kurs;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Date d1 = new Date(86_400_000L * 365 * 52);
        System.out.println(d1);

        //timestamp reprezentuje czas w strefie UTC
        Timestamp t1 = new Timestamp(86_400_000L * 365 * 52);
        System.out.println(t1);

        Timestamp t2 = Timestamp.from(Instant.now());
        System.out.println(t2);

        Timestamp t3 = Timestamp.valueOf("2022-07-03 19:02:12");
        System.out.println(t3);

        //Instant reprezentuej czas w danej chwili
        Instant i1 = Instant.now();
        System.out.println(i1);
        Instant i2 = Instant.ofEpochMilli(86_400_000L * 365 * 52);
        System.out.println(i2);
        Instant i3 = Instant.ofEpochSecond(86_400L * 365 * 52);
        System.out.println(i3);

        Duration dur1 = Duration.between(i2, i1);
        System.out.println(dur1.toDays());

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15,12);
        System.out.println(lt2.minusMinutes(453));
        System.out.println(lt2.getMinute());


        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(1999,11,17);
        LocalDate ld3 = LocalDate.of(1999, Month.NOVEMBER,17);
        System.out.println(ld2);
        System.out.println(ld3.getEra());
        System.out.println(ld3.getDayOfWeek());
        System.out.println(ld3.isLeapYear());


        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2000,12,20,10,43);
        System.out.println(ldt2);

        //użycie DateTimeFormattera
        //•	dd - dzień,
        //•	MM - miesiąc,
        //•	yyyy - rok,
        //•	HH - godzina,
        //•	mm - minuta,
        //•	ss - sekunda.
        //domyślny format daty yyyy-MM-dd HH:mm:ss

        Scanner scanner = new Scanner(System.in);
        String dateFormat = "yyyy/MM/dd";
        System.out.println("Podaj date w formacie " + dateFormat + ":");
        String date = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate userDate = LocalDate.parse(date);
        System.out.println(userDate.getDayOfWeek());



    }
}
