package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

	private double salario;

	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionário");

	}

	static {
		System.out.println("Dentro do bloco de inicialização estático de funcionario");
	}

	{
		System.out.println("Bloco de inicialização não estático de funcionario 1");
	}

	{
		System.out.println("Bloco de inicialização não estático de funcionario 2");
	}
	
	// Sobrescrevendo o método da classe Pessoa -> (Tem que ser o mesmo nome do
	// método) <-, ou seja, pegando também o método
	// imprime, adicionando o super, pra imprimir o salaário.
	public void imprime() {
		super.imprime();
		System.out.println("Seu salario é: " + this.salario);
	}

	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
