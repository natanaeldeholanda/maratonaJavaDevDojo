package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    //Vídeo 206 -> FlatMap
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicsDesigners = List.of("Stan Lee", "Rob Leifield", "Kevin Feith");
        List<String> developers = List.of("Natanael de Holanda", "Pedro Phellipe");
        List<String> students = List.of("Natanael", "Eduardo Carmo", "Jéssica");
        devdojo.add(graphicsDesigners); //adicionando todos os graphicsDesigners
        devdojo.add(developers); //adicionando todos os developers
        devdojo.add(students); //adicionando todos os students

        //Imprimir todas as variáveis inseridas com valores aninhados do List<List<String>>
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------------------------");
        //retirando os valores aninhados do List<List<String>> .flatMap;
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
