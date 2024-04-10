package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.nome = "Natanael";
		professor.idade = 89;
		professor.sexo = 'M';

		System.out.printf("Eu sou o professor %s, tenho %d anos e sou do sexo %c.", professor.nome, professor.idade,
				professor.sexo);

	}

}
