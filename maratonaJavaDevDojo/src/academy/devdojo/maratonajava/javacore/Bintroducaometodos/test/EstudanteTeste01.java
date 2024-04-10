package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;


public class EstudanteTeste01 {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante01.nome = "Natanael";
		estudante01.idade = 19;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Oliveira";
		estudante02.idade = 17;
		estudante02.sexo = 'M';
			
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		
		System.out.println("**********************");
		
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		

	}
}