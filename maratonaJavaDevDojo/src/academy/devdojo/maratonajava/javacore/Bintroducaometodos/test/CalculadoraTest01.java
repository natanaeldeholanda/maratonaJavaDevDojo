package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
	
	// Chamando o método somaDoisNumeros, precisa sempre criar o objeto.
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();

	}

}
