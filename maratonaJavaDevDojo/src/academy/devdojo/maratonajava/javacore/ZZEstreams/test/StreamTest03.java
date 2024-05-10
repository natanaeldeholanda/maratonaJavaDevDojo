package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = lightNovels.stream();
        //Imprime a lista de light novels, em ordem de inserção, colocando o próximo anime abaixo;
        lightNovels.forEach(System.out::println);
        //Contar quandos elementos tem dentro da lista, menor do que o preço que define;
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
        //Contar quandos elementos tem dentro da lista, que são distintos, menor do que o preço que define;
        long countDistinct = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(countDistinct);

    }
}
