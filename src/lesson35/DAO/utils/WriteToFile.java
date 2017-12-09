package lesson35.DAO.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static  <T> T  WriteToFile(T t, String fileName) throws Exception {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

            bw.append(t.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Can't write to fileDB");
        }

        return t;
    }
}