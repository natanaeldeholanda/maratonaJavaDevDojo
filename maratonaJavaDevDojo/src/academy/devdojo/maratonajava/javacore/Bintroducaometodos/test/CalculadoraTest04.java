package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int numero1 = 1;
		int numero2 = 2;
		
		calculadora.alteraDoisNumeros(numero1, numero2);
		System.out.println("Dentro CalculadoraTest04");
		System.out.println("Número " + numero1); // Está sendo impresso a variável local, e não a no método alteraDoisNumeros
		System.out.println("Número " + numero2); // Está sendo impresso a variável local, e não a no método alteraDoisNumeros
				
	}

}
