package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 900), new Anime("One Piece", 500), new Anime("Naruto", 901)));

        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())); outra forma de fazer a comparação.
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        //animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
