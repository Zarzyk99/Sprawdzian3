package pl.kurs.zadanie2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.sql.Date;
import java.util.*;

public class Runner {

    private static void recurrentScanning(File[] filesToScan, HashMap<Integer, Day> days) {

        for (File file : filesToScan)
            if (file.isDirectory())
                recurrentScanning(Objects.requireNonNull(file.listFiles()), days);
            else {
                BasicFileAttributes attrs;

                try{
                    attrs = Files.readAttributes(file.toPath(),BasicFileAttributes.class,LinkOption.NOFOLLOW_LINKS);
                }catch (IOException e){
                    e.printStackTrace();
                    return;
                }

                FileTime fileTime = attrs.creationTime();

                java.util.Date yourDate = Date.from(fileTime.toInstant());

                Calendar c = Calendar.getInstance();
                c.setTime(yourDate);

                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

                Day day = days.get(dayOfWeek);
                day.setCount(day.getCount() + 1);

            }
    }


    public static void main(String[] args) {

        HashMap<Integer, Day> days = new HashMap<>(
                Map.of(
                        1, new Day("Sunday"),
                        2, new Day("Monday"),
                        3, new Day("Tuesday"),
                        4, new Day("Wednesday"),
                        5, new Day("Thursday"),
                        6, new Day("Friday"),
                        7, new Day("Saturday")
                )

        );

        String folder = "C:/Projects";

        File file = new File(folder);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("To nie jest poprawna ścieżka do folderu");
            return;
        }

        recurrentScanning(Objects.requireNonNull(file.listFiles()), days);

        for (Day day : days.values())
            System.out.println(day);

    }
}

//    Day{name='Sunday', count=206}
//    Day{name='Monday', count=63}
//    Day{name='Tuesday', count=626}
//    Day{name='Wednesday', count=78}
//    Day{name='Thursday', count=456}
//    Day{name='Friday', count=328}
//    Day{name='Saturday', count=60}
