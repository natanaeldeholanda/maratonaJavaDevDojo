package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("O Grande Software de previsão do futuro! ");
		System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO.");
		String pergunta = teclado.nextLine();
		if (pergunta.charAt(0) == ' ') {
			System.out.println("SIM");
		} else {
			System.out.println("NÃ0");
		}

		teclado.close();
	}

}
