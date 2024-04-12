package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
	//Declarando e criando um construtor, vídeo 58	
	public static void main(String[] args) {
		
		Anime anime = new Anime("Dragon Ball", "Série de TV", 105, "Anime", "Herbert Richards");

		anime.imprimeDadosAnime();
		System.out.println("\nImpressão init2.");
		anime.imprimeDadosAnime2();
	}

}
