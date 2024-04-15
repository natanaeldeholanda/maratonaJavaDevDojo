package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
	
	private String nome;
	private double velocidadeMaxima;
	// Inserindo o modificador static, faz com que o atribuito incida em toda a classe, não somente em um objeto.
	// this se refere ao objeto, apesar de estar dentro do método
	private static double velocidadeLimite = 250;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		//this.velocidadeLimite = velocidadeLimite;
		
	}

	public void imprime() {
		System.out.println("--------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
		
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite () {
		return velocidadeLimite;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
//	public double getVelocidadeLimite() {
//		return velocidadeLimite;
//	}
//	public void setVelocidadeLimite(double velocidadeLimite) {
//		this.velocidadeLimite = velocidadeLimite;
//	}
	

}
