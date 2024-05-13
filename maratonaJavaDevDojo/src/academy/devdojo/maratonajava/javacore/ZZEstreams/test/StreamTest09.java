package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        //Função para trazer os números pares incluindo o 50
        IntStream.rangeClosed(1, 50).filter(i -> i % 2 == 0).forEach(n -> System.out.print(n + " "));
        //Função para trazer os números ímpares incluindo o 50
        System.out.println();
        System.out.println("--------------------");
        IntStream.rangeClosed(1, 50).filter(i -> i % 2 == 1).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Criando uma Stream de Strings");
        Stream.of("Eleve", "o ", "Cosmo", "no seu coração").map(String::toUpperCase).forEach(System.out::println);

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num).average().ifPresent(System.out::println);
        System.out.println("---------------");
        System.out.println("Lendo um arquivo usando Stream, filtrando a linha só onde aparece a palavra que quero");
        try(Stream <String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------");
        System.out.println("Lendo um arquivo usando Stream");
        try(Stream <String> lines = Files.lines(Paths.get("file.txt"))){
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
