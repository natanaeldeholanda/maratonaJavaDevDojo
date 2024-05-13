package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        System.out.println("Método para agrupar a categoria e retornar as estatísticas: ");
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        System.out.println("---------------------------------------------");
        System.out.println("Método para agrupar a categoria e retornar as estatísticas das promoções: ");
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        System.out.println("---------------------------------------------");
        System.out.println("Método para agrupar a categoria e retornar as estatísticas das promoções: ");
        Map<Category, LinkedHashSet<Promotion>> collect2= lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
