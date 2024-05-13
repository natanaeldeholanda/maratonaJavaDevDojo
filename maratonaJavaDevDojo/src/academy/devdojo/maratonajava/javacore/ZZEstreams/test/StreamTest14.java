package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 6.87, Category.FANTASY),
            new LightNovel("Jaspion", 7.91, Category.DRAMA),
            new LightNovel("Naruto", 6.79, Category.ROMANCE),
            new LightNovel("Yo-yo-hakusho", 4.39, Category.ROMANCE),
            new LightNovel("Death Note", 1.99, Category.DRAMA),
            new LightNovel("Death Note", 1.99, Category.DRAMA),
            new LightNovel("Tensei Shitara 2", 3.96, Category.FANTASY),
            new LightNovel("Monogatari", 3.91, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        System.out.println("Mostra o agrupamento das categorias: ");
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        System.out.println("---------------------------------");
        System.out.println("Mostra o agrupamento das categorias e preço:");
        Map<Category, Optional<LightNovel>> collectPrice = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collectPrice);
        System.out.println("---------------------------------");
        System.out.println("Mostra o agrupamento das categorias e preço sem o Optional:");
        Map<Category, LightNovel> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect1);
        System.out.println("---------------------------------");
        System.out.println("Outra forma: ");
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);
    }
}
