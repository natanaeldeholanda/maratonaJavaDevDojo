package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
//            char [] in = new char[18];
//            fileReader.read(in);
//            for(char c : in) {
//                System.out.print(c);
//            }

            //Código para ler o texto no arquivo file.txt
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
