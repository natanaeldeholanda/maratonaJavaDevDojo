package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
	private String nome;

	public Anime(String nome) {
		this.nome = nome;
	}

	// Notação usada pra sobrescrever método
	@Override
	// Notação usada pra sobrescrever método
	public String toString() {
		return "Anime: " + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
