package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Escrevendo no file\nContinuando a cantoria na próxima linha");
            fileWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
