package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
	//sobrecarga de métodos, vídeo 57.
	public static void main(String[] args) {
		
		Anime anime = new Anime();
		anime.init("Power Rangers", "TV", 25);
		anime.init2("Power Rangers", "TV", 25, "Infantil");
		
		/*
		 * imprimindo os dados separadamente
		 */		
//		anime.setTipo("TV"); 
//		anime.setNome("Dragon Ball");
//		anime.setEpisodios(12);
		
		anime.imprimeDadosAnime();
		System.out.println("\nImpressão init2.");
		anime.imprimeDadosAnime2();
	}

}
