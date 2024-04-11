package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
	/*
	 * Criação do método: Modificador de acesso -> public private... depois o tipo
	 * de retorno -> no caso void, double, int... depois o nome do método ->
	 * nomeMetodo(){
	 * 
	 * }
	 */

	public void somaDoisNumeros() {
		System.out.println("Resultado da adição: " + (10 + 10));

	}

	public void subtraiDoisNumeros() {
		System.out.println("Resultado da Subtração: " + (2024 - 2022));
	}

	/*
	 * Video 45 -> inserindo parâmetros, dentro dos parênteses, () sempre colocando
	 * o tipo. Para inserir mais de um, coloca vírgula, depois o tipo e depois o
	 * parametro.
	 */
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println("Resultado da Multiplicação: " + num1 * num2);

	}

	public double divideDoisNumeros(double num1, double num2) {

		if (num2 == 0) {
			return 0;
		}
		System.out.println("Resultado da divisão de dois números: ");
		return num1 / num2;
	}

	public void imprimeDivisaoDoisNumeros(double num1, double num2) {

		if (num2 == 0) {
			System.out.println("Não existe divisão por zero!");
			return;
		}
		System.out.println("Resultado da segunda divisão: \n" + num1 / num2);

	}

	public void alteraDoisNumeros(int numero1, int numero2) {
		numero1 = 99;
		numero2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("Número1 " + numero1);
		System.out.println("Número2 " + numero2 + "\n");
	}

	public void somaArray(int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}

	/*
	 * Declarando o método Varargs, sintaxe -> tipo, depois coloca ..., e insere um
	 * atributo Não pode mais de um atributo depois. O varargs tem que ser o último
	 */

	public void somaVarArgs(int... numeros) {

		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}

}
