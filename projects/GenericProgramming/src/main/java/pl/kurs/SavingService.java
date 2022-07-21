package pl.kurs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavingService {
    public static <T extends Vehicle & Serializable> void saveObject(T t, String fileName){

        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
