package pl.kurs.exceptions.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SimpleLogger {


    List<Exception> exceptions = new ArrayList<>();

    public void log(Exception e) {
        exceptions.add(e);
    }

    public void printLogs() {
        for (Exception exception : exceptions) {
            System.out.println(Timestamp.from(Instant.now()) + " // " + exception + " // " + exception.getMessage());
        }
    }
//        System.out.println(Timestamp.from(Instant.now()) + " // " + exceptions);
    public void printLogsInTxt(){
        try (
                FileWriter fw = new FileWriter("logs.txt");
                BufferedWriter bw = new BufferedWriter(fw)
                ){
            for (Exception exception : exceptions) {
                bw.write(String.valueOf(exception));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }

    }


}
