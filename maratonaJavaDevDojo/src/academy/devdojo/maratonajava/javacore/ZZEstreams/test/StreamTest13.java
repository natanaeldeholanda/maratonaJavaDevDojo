package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln ->
                ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        ));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<LightNovel>>>
        // Mostrar os 2 agrupamentos. Categoria e a promoção
        System.out.println("-----------------------------------------");
        System.out.println("Mostrar os 2 agrupamentos. Categoria e a promoção: ");
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln ->
                ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);
    }
}
