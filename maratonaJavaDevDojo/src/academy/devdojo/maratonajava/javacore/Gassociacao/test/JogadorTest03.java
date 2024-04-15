package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
// VÍDEO 67 -> ASSOCIAÇÃO BIDIRECIONAL;
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Erick Pulga");
		Jogador jogador2 = new Jogador("Iuri Castilho");
		Time time = new Time("Ceará Sporting Club");
		Jogador[] jogadores = { jogador1, jogador2 };
		
		jogador1.setTime(time);
		jogador2.setTime(time);
		time.setJogadores(jogadores);

		System.out.println("-> Jogador <- ");
		jogador1.imprimeJogador();
		jogador2.imprimeJogador();
		System.out.println("\n-> time <- ");
		time.imprime();
	}

}
