package academy.devdojo.maratonajava.javacore.Hheranca;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua Soriano Albuquerque, N 230");
		endereco.setCep("60.130-160");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Natanael de Holanda");
		pessoa.setCpf("021.985.273-16");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
			
	}

}
