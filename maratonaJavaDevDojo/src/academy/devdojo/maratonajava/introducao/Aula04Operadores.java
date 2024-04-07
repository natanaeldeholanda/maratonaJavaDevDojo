package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

	public static void main(String[] args) {
		
		// +, -, *, %, e /
		
		int numero1 = 40;
		int numero2 = 20;
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multipicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		int modulo = numero1 % numero2;
		
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A multiplicação é: " + multipicacao);
		System.out.println("A divisão é: " + divisao);
		System.out.println("O resto da divisão é: " + modulo);
		
		
		// OPERADORES LÓGICOS
		
		//<, >, <=, >=, ==, !=, SEMPRE RETORNAM VALOR BOOLEANO 

		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualQueVinte = 10 == 20;
		boolean isDezDiferenteQueVinte = 10 != 20;
		System.out.println("\nisDezMaiorQueVinte? " + isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVinte? " + isDezMenorQueVinte);
		System.out.println("isDezIgualQueVinte? " + isDezIgualQueVinte);
		System.out.println("isDezDiferenteQueVinte? " + isDezDiferenteQueVinte);
	}

}
