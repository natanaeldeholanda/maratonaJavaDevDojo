package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    // Método para organizar os atributos do Anime, por título, e depois chamar na classe usando method reference static
    public static int compareByTitle(Anime anime1, Anime anime2) {
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    // Método para organizar os atributos do Anime, por episódio, e depois chamar na classe usando method reference static
    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
    // Método para organizar os atributos do Anime, por episódio, usando method reference non static
    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
}
