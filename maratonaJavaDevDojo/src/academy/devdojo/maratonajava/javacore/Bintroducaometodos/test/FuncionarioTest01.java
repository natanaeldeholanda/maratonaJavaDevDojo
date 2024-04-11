package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Natanael de Holanda");
		funcionario.setIdade(37);
		funcionario.setSalarios(new double[] { 2250, 4840, 7500 });
		System.out.println("IMPRESSÃO DE DADOS:");
		funcionario.imprimirDados();
		System.out.println("\nMédia: " + funcionario.getMedia());

	}

}
