package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

	public static void main(String[] args) {
		
		/*
		 * 0 - Bloco de inicialização static da superclasse é executado quando a JVM carregar a classe pai
		 * 1 - Bloco de inicialização static da subclasse é executado quando a JVM carregar a classe filha
		 * 2 - Alocado espaço em memória pro objeto da superclasse;
		 * 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado;
		 * 4 - Bloco de inicialização da superclasse é executado na ordem que aparece;
		 * 5 - Construtor é executado da superclasse;
		 * 6 - Alocado espaço em memória pro objeto da subclasse;
		 * 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado;
		 * 8 - Bloco de inicialização da subclasse é executado na ordem que aparece;
		 * 9 - O construtor é executado da subclasse;
		 */
		
		Funcionario funcionario = new Funcionario("Natanael");
	}

}
