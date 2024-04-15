package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
	
	// Leitura de dados pelo console -> Vídeo 68

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Digite  M ou F para seu sexo");
		char sexo = teclado.next().charAt(0);
		
		System.out.println("------------------------");
		System.out.printf("Seu nome é: %s, sua idade é: %d e seu sexo é: %c", nome, idade, sexo);
		
		teclado.close();

	}

}
