package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;


public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animesNonStatic = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 900), new Anime("One Piece", 500), new Anime("Naruto", 901)));
        animeList.sort(animesNonStatic::compareByEpisodesNonStatic);
        //Utilizando lambda pra chamar o método compareByEpsodesNonStatick
        //animeList.sort((a1, a2) -> animesNonStatic.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
