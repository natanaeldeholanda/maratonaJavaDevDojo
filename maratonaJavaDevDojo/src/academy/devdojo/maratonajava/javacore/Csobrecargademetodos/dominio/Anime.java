package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
	private String tipo;
	private String nome;
	private String genero;
	private int episodios;

	public void imprimeDadosAnime() {
		System.out.println(this.tipo);
		System.out.println(this.nome);
		System.out.println(this.episodios);

	}

	public void imprimeDadosAnime2() {
		System.out.println(this.tipo);
		System.out.println(this.nome);
		System.out.println(this.episodios);
		System.out.println(this.genero);
	}
	
	// Declarando e criando um construtor, vídeo 58	
	public Anime() {
		
	}

	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}
	//sobrecarga de métodos, vídeo 57.
	public void init2(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}