package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {

	public static void main(String[] args) {
		
		Local local = new Local("Rua das Laranjeiras");
		Aluno aluno1 = new Aluno("Natanael", 37);
		Aluno aluno2 = new Aluno("Pedro Phelippe", 36);
		Aluno [] alunosParaSeminario = {aluno1, aluno2}; 
		Professor professor1 = new Professor("Rafael","Redes de Computadores");
		Seminario seminario = new Seminario("Onde achar One Piece", alunosParaSeminario, local);
		Seminario [] professorSeminario = {seminario};
		
		professor1.setSeminarios(professorSeminario);
		professor1.imprimeSeminario();

	}

}
