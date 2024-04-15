package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

//VÍDEO 67 -> ASSOCIAÇÃO BIDIRECIONAL;

public class Time {

	private String nome;
	private Jogador[] jogadores;

	// Construtor time e jogador
	public Time(String nome, Jogador[] jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}

	// Construtor
	public Time(String nome) {
		this.nome = nome;
	}

	public void imprime() {
		System.out.println(this.nome);
		if (jogadores == null) {
			return;
		}
		for (Jogador jogador : jogadores) {
			System.out.println(jogador.getNome());
		}
	}

	// Métodos getters and setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

}
