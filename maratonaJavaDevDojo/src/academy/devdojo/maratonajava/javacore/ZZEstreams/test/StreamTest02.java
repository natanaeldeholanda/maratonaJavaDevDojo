package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamTest02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.87),
            new LightNovel("Jaspion", 1.91),
            new LightNovel("Naruto", 6.79),
            new LightNovel("Yo-yo-hakusho", 4.39),
            new LightNovel("Death Note", 1.99),
            new LightNovel("Tensei Shitara 2", 3.96)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(4).map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);

    }
}
