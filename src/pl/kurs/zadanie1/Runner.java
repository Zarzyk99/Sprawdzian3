package pl.kurs.zadanie1;

import java.io.File;
import java.util.Objects;

public class Runner {

    private static File biggestFile = null;

    private static void recurrentScanning(File[] filesToScan) {

        for (File file : filesToScan)
            if (file.isDirectory())
                recurrentScanning(Objects.requireNonNull(file.listFiles()));
            else if (isItJavaFile(file)) {
                if (biggestFile == null)
                    biggestFile = file;
                else if (file.length() > biggestFile.length())
                    biggestFile = file;
            }

    }

    private static boolean isItJavaFile(File file) {
        String[] strings = file.getName().split("\\.", 2);
        return strings[1].equals("java");
    }

    public static void main(String[] args) {

        String folder = "projects";

        File file = new File(folder);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("To nie jest poprawna ścieżka do folderu");
            return;
        }

        recurrentScanning(Objects.requireNonNull(file.listFiles()));

        if (biggestFile == null) {
            System.out.println("Nie znaleziono żadnego pliku java");
            return;
        }
        System.out.println(
                "Biggest file: " + biggestFile.getName() +
                        ",\nwith path: " + biggestFile.getPath() +
                        "\nand size: " + biggestFile.length()
        );


    }
}
