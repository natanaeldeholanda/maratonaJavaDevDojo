package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		Estudante estudante2 = new Estudante();
		estudante.nome = "Natanael";
		estudante.idade = 37;
		estudante.sexo = 'M';
		
		System.out.printf("Dados estudante ->\n Nome: %s\n idade: %d\n sexo: %c\n", estudante.nome, estudante.idade, estudante.sexo);
		System.out.println(estudante2.nome);
		System.out.println(estudante2.sexo);
		System.out.println(estudante2.idade);
	}

}
