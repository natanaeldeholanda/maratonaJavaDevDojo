package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
            try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso!" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}
