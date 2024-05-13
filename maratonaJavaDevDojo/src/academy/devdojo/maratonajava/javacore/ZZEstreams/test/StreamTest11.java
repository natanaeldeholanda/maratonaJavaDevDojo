package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        //Stram Collectors
        System.out.println("Mostrando a quantidade de lightNovels: " + lightNovels.stream().count());
        System.out.println("Mostrando a quantidade de lightNovels: " + lightNovels.stream().collect(Collectors.counting()));
        System.out.println("Trazendo a lightNovels pelo preço, no caso o maior valor: ");
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        System.out.println("Soma dos valores de todas as lightNovels: ");
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println("Retornando o valor médio das lightNovels: ");
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println("Método que retorna a quantidade, soma, valor mínimo e máximo, e também a média de valores de lightNovels: ");
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        System.out.println("Retorna todos os lightNovels em uma única string");
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
