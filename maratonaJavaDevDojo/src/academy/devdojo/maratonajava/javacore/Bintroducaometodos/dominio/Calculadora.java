package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;


public class Calculadora {
	// Criação do método
	public void somaDoisNumeros() {
		System.out.println(10 + 10);
	}

	public void subtraiDoisNumeros() {
		System.out.println(2024 - 2022);
	}

	// Video 45 -> inserindo parâmetros sempre colocando o tipo. Para inserir mais
	// de um, coloca vírgula, depois o tipo e depois o parametro
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);

	}

	public double divideDoisNumeros(double num1, double num2) {

		if (num2 == 0) {
			return 0;
		}

		return num1 / num2;
	}

	public void imprimeDivisaoDoisNumeros(double num1, double num2) {

		if (num2 == 0) {
			System.out.println("Não existe divisão por zero!");
			return;
		}
		System.out.println(num1 / num2);

	}
	
	public void alteraDoisNumeros (int numero1, int numero2) {
		numero1 = 99;
		numero2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("Num1 " + numero1);
		System.out.println("Num2 " + numero2 + "\n");
	}

}
