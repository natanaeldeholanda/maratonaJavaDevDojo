package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	// No IntelliJ, o atalho do main é psvm ctrl + espaço

	public static void main(String[] args) {

		// int, double, float, char, byte, short, long e boolean
		int idade = 10;
		long numeroGrande = 10000000L;
		double salarioDouble = 2000;
		double salarioFloat = 2500F;
		byte idadeByte = 10;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 'M';
		String nome = "Natanael"; // String é uma classe

		System.out.println("A idade é " + idade + " Anos.");
		System.out.println(numeroGrande);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(caractere);
		System.out.println(nome);

	}

}