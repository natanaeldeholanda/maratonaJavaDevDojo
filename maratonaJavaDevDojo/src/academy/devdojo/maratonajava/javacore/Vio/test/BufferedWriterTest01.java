package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) {
            bufferedWriter.write("Escrevendo no file\n");
            burreredWriter.newLine();
            bufferedWriter.flush();
             } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
