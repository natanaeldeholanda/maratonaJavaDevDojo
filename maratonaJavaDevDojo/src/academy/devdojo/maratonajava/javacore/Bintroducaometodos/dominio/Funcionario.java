package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

	private String nome;
	private int idade;
	private double[] salarios;
	private double media;

	public void imprimirDados() {

		System.out.println(this.nome);
		System.out.println(this.idade);
		if (salarios == null) {
			return;
		}
		for (double salario : salarios) {
			System.out.print("Salário: " + salario + "|");
		}

		imprimeMediaSalarial(); // Chamando o método imprimeMediaSalarial, dentro do método imprimirDados
	}

	public void imprimeMediaSalarial() {
		if (salarios == null) {
			return;
		}

		for (double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;

		System.out.printf("\nMedia salarial: R$%.2f", media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}

}
