package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
	
	private String nome;
	//Para declarar uma constante, ou seja final, declarar tudo maiusculo e o espaco ser o undercore _ .
	public static final double VELOCIDADE_LIMITE = 280;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
