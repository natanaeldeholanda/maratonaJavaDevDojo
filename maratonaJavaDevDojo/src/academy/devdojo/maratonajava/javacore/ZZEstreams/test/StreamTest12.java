package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.87, Category.FANTASY),
            new LightNovel("Jaspion", 1.91, Category.DRAMA),
            new LightNovel("Naruto", 6.79, Category.ROMANCE),
            new LightNovel("Yo-yo-hakusho", 4.39, Category.ROMANCE),
            new LightNovel("Death Note", 1.99, Category.DRAMA),
            new LightNovel("Death Note", 1.99, Category.DRAMA),
            new LightNovel("Tensei Shitara 2", 3.96, Category.FANTASY),
            new LightNovel("Monogatari", 3.91,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        System.out.println("Adicionando as categorias em lightNovels: ");
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        System.out.println("Atribuindo as categorias em lightNovels: ");
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case FANTASY: fantasy.add(lightNovel); break;
                case DRAMA: drama.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        System.out.println("Imprimindo as lightNovels por categoria: ");
        System.out.println(categoryLightNovelMap);

        System.out.println("-----------------------");
        System.out.println("Utilizando stream pra imprimir as categorias de lightNovels");
        Map<Category, List<LightNovel>> collectLightNovelsStream = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collectLightNovelsStream);
    }
}
