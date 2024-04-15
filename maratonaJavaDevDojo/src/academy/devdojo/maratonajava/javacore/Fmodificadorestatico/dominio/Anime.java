package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {

	private String nome;
	private static int[] episodios;
	// BLOCOS DE INICIALIZAÇÃO DE INSTÂNCIA -> COLOCA ANTES DOS CONTRUTORES E DEPOIS
	// DOS ATRIBUTOS.

	/*
	 * 0 - Bloco de inicialização é executado quando a JVM carregar a classe
	 * 1 - Alocado espaço em memória pro objeto;
	 * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
	 * 3 - Bloco de inicialização é executado;
	 * 4 - Construtor é executado;
	 */

	static {
		System.out.println("Dentro do bloco de inicialização -> 1");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios [i] = i + 1;

		}
	}
	
	static {
		System.out.println("Dentro do bloco de inicialização -> 2");
	}
	
	static {
		System.out.println("Dentro do bloco de inicialização -> 3");
	}
	
	{
		System.out.println("Não estático. Quando não tem static antes de {}, o mesmo é executado na quantidade dos objetos criados");
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {

		for (int episodio : episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

}
