package academy.devdojo.maratonajava.javacore.Hheranca;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua Soriano Albuquerque, N 230");
		endereco.setCep("60.130-160");
		Pessoa pessoa = new Pessoa("Natanael de Holanda");
		pessoa.setCpf("021.985.273-16");
		pessoa.setEndereco(endereco);
		Funcionario natanael = new Funcionario("Natanael de Holanda e Oliveira");
		natanael.setCpf("021.985.273-16");
		natanael.setEndereco(endereco);
		natanael.setSalario(7500);
		
		
		pessoa.imprime();
		System.out.println();
		natanael.imprime();
					
		natanael.relatorioPagamento();
	}

}
