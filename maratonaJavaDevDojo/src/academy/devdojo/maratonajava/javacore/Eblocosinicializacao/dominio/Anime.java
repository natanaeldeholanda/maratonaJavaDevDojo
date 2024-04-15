package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

	private String nome;
	private int[] episodios;
	// BLOCOS DE INICIALIZAÇÃO DE INSTÂNCIA -> COLOCA ANTES DOS CONTRUTORES E DEPOIS
	// DOS ATRIBUTOS.

	/*
	 * 1 - Alocado espaço em memória pro objeto;
	 * 2 - Cada atributo de classe é
	 * criado e inicializado com valores default ou o que for passado;
	 * 3 - Bloco de inicialização é executado;
	 * 4 - Construtor é executado;
	 */

	{
		System.out.println("Dentro do bloco de inicialização.");
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		
		for (int i = 0; i < episodios.length; i++) {

		}

		for (int episodio : this.episodios) {
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