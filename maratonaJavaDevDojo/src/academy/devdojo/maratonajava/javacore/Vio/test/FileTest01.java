package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado com sucesso = " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Path absoluto " + file.getAbsolutePath());
            System.out.println("Path é um diretório? " + file.isDirectory());
            System.out.println("Path é um arquivo? " + file.isFile());
            System.out.println("Path é um arquivo oculto? " + file.isHidden());
            System.out.println("Path última modificação? " + Instant.ofEpochSecond(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Arquivo excluído com sucesso = " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
