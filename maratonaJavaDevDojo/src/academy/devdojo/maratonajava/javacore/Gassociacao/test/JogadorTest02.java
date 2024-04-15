package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Richard 01");
		Time time = new Time("Ceará");
		
		jogador1.setTime(time);
		jogador1.imprimeJogador();
	}

}
