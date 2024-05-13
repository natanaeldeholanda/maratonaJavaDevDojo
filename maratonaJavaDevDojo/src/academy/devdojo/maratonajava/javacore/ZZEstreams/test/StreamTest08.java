package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.87),
            new LightNovel("Jaspion", 1.91),
            new LightNovel("Naruto", 6.79),
            new LightNovel("Yo-yo-hakusho", 4.39),
            new LightNovel("Death Note", 1.99),
            new LightNovel("Death Note", 1.99),
            new LightNovel("Tensei Shitara 2", 3.96),
            new LightNovel("Monogatari", 3.91)
    ));

    public static void main(String[] args) {
        //Método para retornar todos os lightNovels, acima de 3, somados os valores;
        System.out.println("Soma dos lightNovels, acima de 3: ");
        lightNovels.stream().map(LightNovel::getPrice).filter(price -> price > 3).reduce(Double::sum).ifPresent(System.out::println);
        System.out.println("Soma dos lightNovels, acima de 3 usando tipo primitivo double, pra não fazer boxing e unboxing dos Wrappers: ");
        double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice).filter(price -> price > 3).sum();
        System.out.println(sum);

    }
}
