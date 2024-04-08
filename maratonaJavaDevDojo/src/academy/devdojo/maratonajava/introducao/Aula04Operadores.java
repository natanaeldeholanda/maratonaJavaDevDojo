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

		// <, >, <=, >=, ==, !=, SEMPRE RETORNAM VALOR BOOLEANO

		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualQueVinte = 10 == 20;
		boolean isDezDiferenteQueVinte = 10 != 20;
		System.out.println("\nisDezMaiorQueVinte? " + isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVinte? " + isDezMenorQueVinte);
		System.out.println("isDezIgualQueVinte? " + isDezIgualQueVinte);
		System.out.println("isDezDiferenteQueVinte? " + isDezDiferenteQueVinte);

		// OPERADORES LÓGICOS -> && (AND); || (OR); ! (LOGICAL NOT -> NEGAÇÃO);

		int idade = 37;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

		System.out.println("Salário maior que trinta? " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("Salário menor que trinta? " + isDentroDaLeiMenorQueTrinta);

		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
				|| valorTotalContaPoupanca > valorPlaystation;
		System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

		// OPERADORES ATRIBUIÇÃO -> =, +=, -=, *=, /= e %=

		double bonus = 1800; // 1800
		bonus += 1000; // 2800
		bonus -= 1000; // 1800
		bonus *= 2;
		bonus /= 2;
		bonus %= 2;
		System.out.println("bonus "+ bonus);
		
		// ++, --

		int contador = 0;
		contador += 1; // contador = contador +1
		contador ++;
		int contador2 = 0;
		contador2++;
		System.out.println("contador " + contador);
		System.out.println("contador 2" + contador2++);
	}

}
