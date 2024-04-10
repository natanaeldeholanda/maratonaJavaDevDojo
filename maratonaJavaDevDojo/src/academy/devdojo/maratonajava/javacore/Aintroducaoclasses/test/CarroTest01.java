package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

// Video 42 -> OO Exercício Classes

public class CarroTest01 {

	public static void main(String[] args) {
		Carro citroen = new Carro();
		Carro chevrolet = new Carro();
		
		citroen.nome = "Citroen C3";
		citroen.modelo = "Hatch compacto";
		citroen.ano = 2023;
		
		chevrolet.nome = "Maverick";
		chevrolet.modelo = "Pickup média";
		chevrolet.ano = 2024;
		
		System.out.printf("Tenho um carro %s, modelo %s, ano modelo e fabricação: %d.\n", citroen.nome, citroen.modelo,citroen.ano);
		System.out.printf("Tenho um carro %s, modelo %s, ano modelo e fabricação: %d.", chevrolet.nome, chevrolet.modelo, chevrolet.ano);
		
	}

}
