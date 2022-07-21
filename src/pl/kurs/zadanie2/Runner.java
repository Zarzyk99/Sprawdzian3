package pl.kurs.zadanie2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.sql.Date;
import java.util.Calendar;
import java.util.Objects;

public class Runner {

    private enum Days {
        MONDAY("Poniedzialek"),
        TUESDAY("Wtorek"),
        WEDNESDAY("Środa"),
        THURSDAY("Czwartek"),
        FRIDAY("Piątek"),
        SATURDAY("Sobota"),
        SUNDAY("Niedziela")
        ;

        private final String name;
        private Integer count;

        Days(String name) {
            this.name = name;
            this.count = 0;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "name='" + name + " -> " +
                    "count=" + count +
                    '}';
        }

        public String getName() {
            return name;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    private static void recurrentScanning(File[] filesToScan) {

        for (File file : filesToScan)
            if (file.isDirectory())
                recurrentScanning(Objects.requireNonNull(file.listFiles()));
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

                switch (dayOfWeek){
                    case 1 -> Days.SUNDAY.setCount(Days.SUNDAY.getCount() + 1);
                    case 2 -> Days.MONDAY.setCount(Days.MONDAY.getCount() + 1);
                    case 3 -> Days.TUESDAY.setCount(Days.TUESDAY.getCount() + 1);
                    case 4 -> Days.WEDNESDAY.setCount(Days.WEDNESDAY.getCount() + 1);
                    case 5 -> Days.THURSDAY.setCount(Days.THURSDAY.getCount() + 1);
                    case 6 -> Days.FRIDAY.setCount(Days.FRIDAY.getCount() + 1);
                    case 7 -> Days.SATURDAY.setCount(Days.SATURDAY.getCount() + 1);
                }

            }
    }


    public static void main(String[] args) {

        String folder = "C:/Projects";

        File file = new File(folder);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("To nie jest poprawna ścieżka do folderu");
            return;
        }

        recurrentScanning(Objects.requireNonNull(file.listFiles()));

        for (Days day : Days.values())
            System.out.println(day);

    }
}

//    Day{name='Poniedzialek -> count=63}
//        Day{name='Wtorek -> count=626}
//            Day{name='Środa -> count=78}
//                Day{name='Czwartek -> count=104}
//                    Day{name='Piątek -> count=328}
//                        Day{name='Sobota -> count=55}
//                            Day{name='Niedziela -> count=206}
