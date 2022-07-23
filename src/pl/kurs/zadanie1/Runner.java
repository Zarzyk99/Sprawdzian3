package pl.kurs.zadanie1;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Runner {

    private static void recurrentScanning(File[] filesToScan, AtomicReference<File> biggestFile) {

        for (File file : filesToScan)
            if (file.isDirectory())
                recurrentScanning(Objects.requireNonNull(file.listFiles()), biggestFile);
            else if (isItJavaFile(file)) {
                if (biggestFile.get() == null)
                    biggestFile.set(file);
                else if (file.length() > biggestFile.get().length())
                    biggestFile.set(file);
            }

    }

    private static boolean isItJavaFile(File file) {
        String[] strings = file.getName().split("\\.", 2);
        return strings[1].equals("java");
    }

    public static void main(String[] args) {


        AtomicReference<File> biggestFile = new AtomicReference<>(); //dzięki temu nie gubię referencji do podpisanego pliku :)

        String folder = "projects";

        File file = new File(folder);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("To nie jest poprawna ścieżka do folderu");
            return;
        }

        recurrentScanning(Objects.requireNonNull(file.listFiles()), biggestFile);

        if (biggestFile.get() == null) {
            System.out.println("Nie znaleziono żadnego pliku java");
            return;
        }

        System.out.println(
                "Biggest file: " + biggestFile.get().getName() +
                        ",\nwith path: " + biggestFile.get().getPath() +
                        "\nand size: " + biggestFile.get().length()
        );


    }
}
//Biggest file: ListRunner.java,
//with path: projects\ColectionsFramework\src\main\java\pl\kurs\ListRunner.java
//and size: 4587