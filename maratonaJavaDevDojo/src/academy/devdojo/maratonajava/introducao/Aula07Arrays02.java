package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {

	public static void main(String[] args) {
		// Array é sempre um objeto
		// byte, short, int, long, float e double -> valor é 0
		// char -> '\u0000'
		// boolean -> false
		// String null

		int[] idades = new int[3];
		String[] nomes = new String[2];
		idades[0] = 21;
		idades[1] = 25;
		idades[2] = 30;
		nomes[0] = "Natanael";
		nomes[1] = "Holanda";
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);

		// .length, imprime o tamanho do array, ou qualque coisa declarada.
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Laço for -> " + nomes[i]);
		}

	}

}
