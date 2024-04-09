package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

	public static void main(String[] args) {
		// int [] numeros = new int [3];
		int[] numeros2 = { 1, 2, 3, 4, 5 }; // Inciando diretamente com os valores
		int[] numeros3 = new int[] { 6, 7, 8, 9, 10 }; // Inciando diretamente com os valores

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}

		for (int num : numeros3) {
			System.out.println(num + " Usando o Foreach");
		}

	}

}
