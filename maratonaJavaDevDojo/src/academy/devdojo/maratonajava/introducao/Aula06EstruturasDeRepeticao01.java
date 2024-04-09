package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
	public static void main(String[] args) {
		// while, do while e for (booleano)
		
		//SINTAXE -> WHILE
		int count = 0;
		while (count < 10) {
			System.out.println(++count);
		}
		count = 0;
		
		//SINTAXE -> DO WHILE
		do {
			System.out.println("Dentro do do-while " + ++count);
		} while (count < 10);

		//SINTAXE -> FOR
		
		for (int i = 0; i < 10; i++) {
			System.out.println("For " + i);
		}

	}
}
