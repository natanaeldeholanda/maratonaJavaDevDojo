package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

	public static void main(String[] args) {
	
		Jogador jogador1 = new Jogador("Mota");
		Jogador jogador2 = new Jogador("Magno Alves");
		Jogador jogador3 = new Jogador("Ricardinho");
		
		
		//Criando array de jogadores, pois queremos usar todos os jogadores em um lugar só;
		Jogador [] jogadores = {jogador1, jogador2, jogador3};
		
		
		for(Jogador jogador : jogadores) {
			jogador.imprimeJogador();
		}

	}

}
