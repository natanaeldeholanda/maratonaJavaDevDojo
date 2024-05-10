package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.87),
            new LightNovel("Jaspion", 1.91),
            new LightNovel("Naruto", 6.79),
            new LightNovel("Yo-yo-hakusho", 4.39),
            new LightNovel("Death Note", 1.99),
            new LightNovel("Death Note", 1.99),
            new LightNovel("Tensei Shitara 2", 3.96)
    ));

    public static void main(String[] args) {
        System.out.println("Retorna qualquer um é maior que 8: " + lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println("Retorna todos que são maior que 0: " + lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println("Retorna nenhum maior que 0: " + lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findFirst().ifPresent(System.out::println);
    }
}
