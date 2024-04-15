package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;

	}

	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}

	public void imprimeSeminario() {
		System.out.println("------------------");
		System.out.println("Professor: " + this.nome);
		if (this.seminarios == null) {
			return;
		}
		System.out.println("**** Seminários Cadastrados: ****");
		for (Seminario seminario : this.seminarios) {
			System.out.println("Seminário: " + seminario.getTitulo());
			System.out.println("Local: " + seminario.getLocal().getEndereco());

			if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
				continue;
			}
			System.out.println("**** Alunos Cadastrados ****");
			for (Aluno alunos : seminario.getAlunos()) {
				System.out.println("Aluno: " + alunos.getNome() + ", Idade:" + alunos.getIdade());
			}

		}
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
