package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor3;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2();
             Leitor3 leitor3 = new Leitor3()) {
            // Aqui você pode usar os leitores leitor1 e leitor2 para ler arquivos
            // ou realizar outras operações.
            // Eles serão automaticamente fechados após a execução deste bloco.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        // Corrigindo o erro de sintaxe: "new null" não faz sentido.
        // Vamos criar um BufferedReader para ler o arquivo "teste.txt".
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            // Aqui você pode usar o reader para ler o arquivo "teste.txt".
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
