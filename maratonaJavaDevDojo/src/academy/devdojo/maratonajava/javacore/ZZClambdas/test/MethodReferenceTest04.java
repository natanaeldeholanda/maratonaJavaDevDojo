package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animesNonStatic = new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 900), new Anime("One Piece", 500), new Anime("Naruto", 901)));
        //animeList.sort(animesNonStatic::compareByEpisodesNonStatic);
        System.out.println(animeList);
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        //Criando o anime através do apply
        System.out.println(animeBiFunction2.apply("Super Campeões", 36));
    }
}
